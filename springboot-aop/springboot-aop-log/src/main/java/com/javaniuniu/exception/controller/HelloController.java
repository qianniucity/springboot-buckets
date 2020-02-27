package com.javaniuniu.exception.controller;

import com.javaniuniu.exception.VO.User;
import com.javaniuniu.exception.aspect.UserAccess;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop")
@Api(value = "HelloController", description = "SpringBoot AOP演示")
@Slf4j
public class HelloController {

    @ApiOperation(value = "传递JSON，User接收", httpMethod = "POST", code = 200, produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(value = "/sendJson", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Object sendJson(@RequestBody User user) {
        String name = user.getName();
        String age = user.getAge();

        log.info(name + age);
        return "name:" + name + "age:" + age;
    }

    @ApiOperation(value = "打印错误日志", httpMethod = "POST", code = 200, produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(value = "/doError", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Object error() {
        return 1 / 0;
    }

    @ApiOperation(value = "Aop配合注解编程", httpMethod = "POST", code = 200, produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(value = "/annotation", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @UserAccess(desc = "annotation")
    public Object annotation() {
        return "annotation controller";
    }

}
