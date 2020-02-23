package com.javaniuniu.async.service.impl;

import com.javaniuniu.async.service.PiceaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Service
@Slf4j
public class PiceaServiceImpl implements PiceaService {
    @Async("piceaTaskExecutor")
    @Override
    public void asyncTask() throws Exception {
        log.info("异步线程，线程名：" + Thread.currentThread().getName());
        log.info("异步处理方法-----start-------");
        log.info("------------------------在看貂蝉，不要打扰--------------");
        String noNum = "sdfdfsd";
        //把一个非数字转成数字，抛出异常来测试。
        int i = Integer.parseInt(noNum);
        Thread.sleep(2000);
        log.info("异步处理方法------end--------");
    }

    @Async("piceaTaskExecutor")
    @Override
    public Future<String> asyncTaskFuture() throws Exception {
        log.info("异步线程，线程名：" + Thread.currentThread().getName());
        log.info("异步处理方法-----start-------asyncTaskFuture---");
        int k = 1;
        Thread.sleep(2000);
        log.info("异步处理方法-----end---------asyncTaskFuture---");
        return new AsyncResult<String> (String.valueOf(k));
    }

    @Async("piceaTaskExecutor")
    @Override
    public Future<String> asyncTaskFuture2() throws Exception {
        log.info("异步线程，线程名：" + Thread.currentThread().getName());
        log.info("异步处理方法-----start-------asyncTaskFuture-----2---");
        int k = 2;
        log.info("异步处理方法-----end---------asyncTaskFuture-----2---");
        return new AsyncResult<String> (String.valueOf(k));
    }



}