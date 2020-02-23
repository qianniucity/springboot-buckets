package com.javaniuniu.async.contoller;

import com.javaniuniu.async.service.PiceaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * <p>PiceaContoller</p>
 * <p>description.</p>
 *
 */
@RestController
@Slf4j
@RequestMapping("/async")
public class PiceaContoller {

    @Autowired
    private PiceaService piceaService;

    @RequestMapping("/asyncTask")
    public void asyncTask() throws Exception {
        log.info("在控制层调用的线程名："+ Thread.currentThread().getName());
        piceaService.asyncTask();
    }

    @RequestMapping("/asyncTaskFuture")
    public String asyncTaskFuture()  {
        log.info("在控制层调用的线程名："+ Thread.currentThread().getName());
        String ret = null;
        try {
            //异步先执行任务1
            Future<String> future = piceaService.asyncTaskFuture();
            //异步执行任务2
            Future<String> future2 = piceaService.asyncTaskFuture2();
            //取任务1的执行结果，设置超时时间
            String ret1 = future.get(1, TimeUnit.SECONDS);
            //去任务2的执行结果，设置超时时间
            String ret2 = future2.get(10,TimeUnit.SECONDS);

            //任务1结果+任务2结果
            ret = ret1 + "+" + ret2;
            //最终返回任何合集
            return  ret;
        } catch (InterruptedException e) {
            e.printStackTrace();
            log.info("------我是Async有返回方法的异常处理方法----InterruptedException-----");
        } catch (ExecutionException e) {
            e.printStackTrace();
            log.info("------我是Async有返回方法的异常处理方法----ExecutionException-----");
        } catch (Exception e) {
            e.printStackTrace();
            log.info("------我是Async有返回方法的异常处理方法----Exception-----");
        }
       return null;
    }
}