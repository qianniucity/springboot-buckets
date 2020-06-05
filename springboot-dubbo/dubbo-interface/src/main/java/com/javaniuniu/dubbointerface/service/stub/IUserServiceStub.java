package com.javaniuniu.dubbointerface.service.stub;

import com.javaniuniu.dubbointerface.service.IUserService;

/**
 * @auther: javaniuniu
 * @date: 2020/6/5 1:42 PM
 */
public class IUserServiceStub implements IUserService {
    private final IUserService userService;

    //构造函数传入真正的远程代理对象
    public IUserServiceStub(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public String hello(String name) {
        if(name == null || "".equals(name)){
            return "validate param";
        }
        return userService.hello(name);
    }
}
