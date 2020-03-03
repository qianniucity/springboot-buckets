package com.javaniuniu.transactional.controller;

import com.javaniuniu.transactional.model.SysUser;
import com.javaniuniu.transactional.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/28 7:07 PM
 */
@RestController
@Api(value = "HelloController", description = "SpringBoot AOP演示事务")
@RequestMapping("api/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @PostMapping(value = "/save")
    public Object save(@RequestBody SysUser user) {
        sysUserService.save(user);
        return 1;
    }

    @GetMapping(value = "/delete")
    public Object delete(@RequestParam("id") String id) {
        sysUserService.delete(id);
        return 1;
    }

    @GetMapping(value = "/findAll")
    public Object findAll() {
        return sysUserService.findAll();
    }


}