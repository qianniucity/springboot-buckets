package com.javaniuniu.thread.async.contoller;//package com.javaniuniu.async.contoller;

import com.javaniuniu.thread.async.service.TaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.WebAsyncTask;

import java.util.concurrent.Callable;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/23 3:37 PM
 */

@RestController
@Slf4j
@RequestMapping("/async")
public class WebAsyncTaskContoller {
    private final static String ERROR_MESSAGE = "Task error";
    private final static String TIME_MESSAGE = "Task timeout";

    @Autowired
    private TaskService taskService;

    @Autowired
    @Qualifier("piceaTaskExecutor")
    private ThreadPoolTaskExecutor executor;

    @RequestMapping(value = "/task/{timeout}", method = RequestMethod.POST)
    public WebAsyncTask<String> deferredResult(@PathVariable("timeout") int timeout) throws Exception {
        log.info("WebAsyncTask控制层执行线程:" + Thread.currentThread().getName());
        // 模拟开启一个异步任务，超时时间为10s
        WebAsyncTask<String> result = new WebAsyncTask<String>(10 * 1000L, executor, new Callable<String>() {
            @Override
            public String call() throws Exception {
                log.info("WebAsyncTask控制层执行线程:" + Thread.currentThread().getName());
                String future = taskService.task2();
                log.info(future);
                // 任务处理时间4s，不超时
                Thread.sleep(timeout * 1000L);
                return ("WebAsyncTask这是【异步】的请求返回: " + future);
            }
        });
        result.onError(() -> {
            log.error("任务执行异常Error");
            return ERROR_MESSAGE;
        });

        //定义超时
        result.onTimeout(new Callable<String>() {
            @Override
            public String call() throws Exception {
                log.info("WebAsyncTask异步线程执行超时");
                return "WebAsyncTask线程执行超时";
            }
        });

        //定义完成,即使是超时，也会运行此方法
        result.onCompletion(new Runnable() {
            @Override
            public void run() {
                log.info("WebAsyncTask异步执行完毕");
            }
        });
        return result;
    }
}
/***
 * 2020-02-23 16:00:19.749  INFO 15056 --- [nio-8080-exec-1] c.j.async.contoller.AsyncContoller       : 控制层执行线程:http-nio-8080-exec-1
 * 2020-02-23 16:00:19.759  INFO 15056 --- [         task-1] c.j.async.contoller.AsyncContoller       : 控制层执行线程:task-1
 * 2020-02-23 16:00:19.759  INFO 15056 --- [         task-1] c.j.async.service.AsyncTaskService       : asyncInvokeReturnFuture, parementer=5
 * 2020-02-23 16:00:24.765  INFO 15056 --- [         task-1] c.j.async.contoller.AsyncContoller       : success:5
 * 异步执行完毕
 * 2020-02-23 16:00:46.942  INFO 15056 --- [nio-8080-exec-3] c.j.async.contoller.AsyncContoller       : 控制层执行线程:http-nio-8080-exec-3
 * 2020-02-23 16:00:46.960  INFO 15056 --- [         task-2] c.j.async.contoller.AsyncContoller       : 控制层执行线程:task-2
 * 2020-02-23 16:00:46.962  INFO 15056 --- [         task-2] c.j.async.service.AsyncTaskService       : asyncInvokeReturnFuture, parementer=5
 * 2020-02-23 16:00:51.965  INFO 15056 --- [         task-2] c.j.async.contoller.AsyncContoller       : success:5
 * 异步执行完毕
 * 2020-02-23 16:01:27.615  INFO 15056 --- [nio-8080-exec-5] c.j.async.contoller.AsyncContoller       : 控制层执行线程:http-nio-8080-exec-5
 * 2020-02-23 16:01:27.617  INFO 15056 --- [         task-3] c.j.async.contoller.AsyncContoller       : 控制层执行线程:task-3
 * 2020-02-23 16:01:27.618  INFO 15056 --- [         task-3] c.j.async.service.AsyncTaskService       : asyncInvokeReturnFuture, parementer=5
 * 2020-02-23 16:01:32.621  INFO 15056 --- [         task-3] c.j.async.contoller.AsyncContoller       : success:5
 * 异步执行完毕
 */

