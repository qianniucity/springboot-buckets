package com.javaniuniu.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.javaniuniu.dubbointerface.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther: javaniuniu
 * @date: 2020/6/5 12:58 PM
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Reference(version = "*", loadbalance="roundrobin" ,stub = "com.javaniuniu.dubbointerface.service.stub.IUserServiceStub") // 负载均衡策略
    private IUserService userService;

    @RequestMapping("hello")
    public String hello(String name){
        System.out.println("hello springboot-consumer");
        return userService.hello(name);
    }
}
