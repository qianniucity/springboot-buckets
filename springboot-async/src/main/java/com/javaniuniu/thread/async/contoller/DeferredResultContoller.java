package com.javaniuniu.thread.async.contoller;


import com.javaniuniu.thread.async.service.TaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;


/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/23 4:33 PM
 */
@RestController
@Slf4j
@RequestMapping("/async")
public class DeferredResultContoller {

    @Autowired
    private TaskService taskService;

    @Autowired
    @Qualifier("piceaTaskExecutor")
    private ThreadPoolTaskExecutor executor;

    @RequestMapping(value = "/deferredresult/{timeout}", method = RequestMethod.POST)
    public DeferredResult<String> deferredResult(@PathVariable("timeout") int timeout) throws Exception {
        log.info("DeferredResult控制层执行线程:" + Thread.currentThread().getName());
        //超时
        DeferredResult<String> deferredResult = new DeferredResult<>(10 * 1000L);
        deferredResult.onTimeout(new Runnable() {
            @Override
            public void run() {
                log.info("DeferredResult异步线程执行超时");
                deferredResult.setResult("DeferredResult线程执行超时");
            }
        });
        deferredResult.onCompletion(new Runnable() {
            @Override
            public void run() {
                System.out.println("DeferredResult异步执行完毕");
            }
        });
        executor.execute(new Runnable() {
            @Override
            public void run() {
                log.info("DeferredResult异步执行线程:" + Thread.currentThread().getName());
                try {
                    String future = taskService.task2();
                    Thread.sleep(timeout * 1000);
                    deferredResult.setResult("DeferredResult这是【异步】的请求返回: " + future);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        return deferredResult;
    }

}
