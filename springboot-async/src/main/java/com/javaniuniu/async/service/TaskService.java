package com.javaniuniu.async.service;

import org.springframework.stereotype.Service;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/23 8:11 PM
 */
@Service
public class TaskService {
    public void task() throws Exception {
        System.out.println("------------------------在看貂蝉，不要打扰--------------");
        Thread.sleep(1000);
    }

    public String task2() throws Exception {
        int k = 5;
        System.out.println("------------------------在看鱼，不要打扰--------------");
        Thread.sleep(1000);
        return (String.valueOf(k));
    }
}
