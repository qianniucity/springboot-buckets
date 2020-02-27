package com.javaniuniu.jpa.model;

import com.javaniuniu.jpa.SpringbootJpaApplicationTests;
import com.javaniuniu.jpa.repository.UserRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/26 1:02 PM
 */
public class UserTest extends SpringbootJpaApplicationTests {
    @Autowired
    UserRepository userRepository;

    @Test //测试
    public void saveUseT() {
        User user = new User();
//        user.setUsername("javaniuniu");
        user.setPassword("1234563");
        user.setRealName("java牛牛");
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        userRepository.save(user);
    }
}
