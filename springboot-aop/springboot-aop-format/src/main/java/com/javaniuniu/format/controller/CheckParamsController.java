package com.javaniuniu.format.controller;

import com.javaniuniu.format.annotation.Trim;
import com.javaniuniu.format.model.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/27 10:26 PM
 */
@RestController
public class CheckParamsController {


    @Trim
    @RequestMapping(value = "/paramsNotNull", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String checkParamsNOtNull(@RequestParam String name) {
        return name;
    }

    @Trim
    @RequestMapping(value = "/userNotNull", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String checkUserNOtNull(@RequestBody User user) {

        return user.getId() + "&" + user.getName();
    }

}
