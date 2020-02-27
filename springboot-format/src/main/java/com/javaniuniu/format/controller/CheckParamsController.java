package com.javaniuniu.format.controller;

import com.javaniuniu.format.annotation.ParamsNotNull;
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


    @RequestMapping(value = "/notnull", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String checkParamsNOtNull(@RequestParam @ParamsNotNull String name) {
        return name;
    }

}
