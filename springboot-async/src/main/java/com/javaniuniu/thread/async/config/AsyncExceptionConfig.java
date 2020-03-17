package com.javaniuniu.thread.async.config;

import com.javaniuniu.thread.async.exception.AsyncExceptionHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;

/**
 * <p>AsyncExceptionConfig</p>
 * <p>description.</p>
 * 异常处理配置
 */
@Configuration
@Slf4j
public class AsyncExceptionConfig implements AsyncConfigurer {


    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return new AsyncExceptionHandler();
    }

}