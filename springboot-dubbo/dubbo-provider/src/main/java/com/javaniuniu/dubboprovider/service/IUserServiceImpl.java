package com.javaniuniu.dubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.javaniuniu.dubbointerface.service.IUserService;

/**
 * @auther: javaniuniu
 * @date: 2020/6/4 11:12 PM
 */
@Service(version = "1.0.0") // 版本控制
public class IUserServiceImpl implements IUserService {
    @Override
    public String hello(String name) {
        System.out.println("Hello springboot-provider...");
        return "hello:" + name;
    }
}
