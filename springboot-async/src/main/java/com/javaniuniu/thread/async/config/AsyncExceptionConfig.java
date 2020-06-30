package com.javaniuniu.thread.async.config;

import com.javaniuniu.thread.async.exception.AsyncExceptionHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>AsyncExceptionConfig</p>
 * <p>description.</p>
 * 异常处理配置
 */
@Configuration
@Slf4j
public class AsyncExceptionConfig implements AsyncConfigurer {


    public static void main(String[] args) {
        Map d = new HashMap();
        d.put(null,null);
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return new AsyncExceptionHandler();
    }

}
