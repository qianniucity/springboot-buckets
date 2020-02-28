package com.javaniuniu.transactional.controller;

import com.javaniuniu.transactional.model.SysDepartment;
import com.javaniuniu.transactional.service.SysDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/28 7:07 PM
 */

@RestController
@RequestMapping("api/department")
public class SysDepartmentController {

    @Autowired
    private SysDepartmentService departmentService;

    @PostMapping(value="/save")
    public Object save(@RequestBody SysDepartment department) {
        departmentService.save(department);
        return 1;
    }

    @GetMapping(value="/delete")
    public Object delete(@RequestParam("id") String id) {
        departmentService.delete(id);
        return 1;
    }

    @GetMapping(value="/findAll")
    public Object findAll() {
        return departmentService.findAll();
    }
}