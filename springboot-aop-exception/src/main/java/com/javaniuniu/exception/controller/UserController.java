package com.javaniuniu.exception.controller;

import com.javaniuniu.exception.annotation.ParamValidate;
import com.javaniuniu.exception.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/27 10:26 PM
 */
@Slf4j
@RequestMapping("/user")
@RestController
public class UserController {

    @ParamValidate
    @RequestMapping("/addUser")
    public String addUser(@RequestBody @Valid User user, BindingResult result) throws Exception {
        int i = 1 / 0;
        return "success";
    }
}