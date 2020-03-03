package com.javaniuniu.filter.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.DispatcherType;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/3/2 10:22 PM
 * Filter配置
 */
@Configuration
public class FilterConfig {

    /**
     * 去除参数头尾空格过滤器
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean parmsFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setDispatcherTypes(DispatcherType.REQUEST);
        registration.setFilter(new ParamRequestFilter());
        registration.addUrlPatterns("/*");
        registration.setName("parameterTrimFilter");
        registration.setOrder(Integer.MAX_VALUE - 1);
        return registration;
    }
}
