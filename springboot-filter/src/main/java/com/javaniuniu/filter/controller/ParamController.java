package com.javaniuniu.filter.controller;

import com.javaniuniu.filter.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/3/2 10:24 PM
 */
@Slf4j
@RestController
public class ParamController {
    /**
     * get方法
     *
     * @param userName
     * @return
     */
    @RequestMapping(value = "getUserAndId", method = RequestMethod.GET)
    public String helloGet(@RequestParam String userName, @RequestParam Integer id) {
        log.info("get使用参数：" + userName + "&" + id);
        return userName + "&" + id;
    }

    @RequestMapping(value = "getUserAndPassword", method = RequestMethod.GET)
    public String helloGet(@RequestParam String userName, @RequestParam String password) {
        log.info("get使用参数：" + userName + "&" + password);
        return userName + "&" + password;
    }

    /**
     * post方法
     *
     * @param userName
     * @return
     */
    @RequestMapping(value = "postUserAndId", method = RequestMethod.POST)
    public String helloPost(@RequestParam String userName, @RequestParam Integer id) {
        log.info("post使用参数：" + userName + "&" + id);
        return userName + "&" + id;
    }

    @RequestMapping(value = "postUserAndPassword", method = RequestMethod.POST)
    public String helloPost(@RequestParam String userName, @RequestParam String password) {
        log.info("post使用参数：" + userName + "&" + password);
        return userName + "&" + password;
    }

    @RequestMapping(value = "postUser", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String helloUser(@RequestBody User user) {
        log.info("post使用参数：" + user.getName());
        return user.getName() + "&" + user.getId();
    }

}
