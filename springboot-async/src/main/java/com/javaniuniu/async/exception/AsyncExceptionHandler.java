package com.javaniuniu.async.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/23 9:44 AM
 * 异常处理类
 */
@Slf4j
public class AsyncExceptionHandler implements AsyncUncaughtExceptionHandler {
    @Override
    public void handleUncaughtException(Throwable throwable, Method method, Object... objects) {
        log.error("--------------------error---------------");
        log.error("Async method has uncaught exception, params:{}" + Arrays.toString(objects));
        if (throwable instanceof AsyncException) {
            AsyncException asyncException = (AsyncException) throwable;
            log.error("asyncException:" + asyncException.getMessage());
        }
        if (throwable instanceof InterruptedException) {
            log.error("InterruptedException-------------------");
        }
        if (throwable instanceof NumberFormatException) {
            log.error("NumberFormatException-------------------");
        }
        log.error("Exception :", throwable);
    }
}
