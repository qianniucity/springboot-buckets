package com.javaniuniu.jpa.model;

import com.javaniuniu.jpa.SpringbootJpaApplicationTests;
import com.javaniuniu.jpa.repository.UserTRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;


/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/26 11:18 AM
 */
@Slf4j
public class UserTTest extends SpringbootJpaApplicationTests {
    @Autowired
    UserTRepository userTRepository;

    @Test //测试 @DynamicInsert
    public void saveUseT() {
        UserT userT = new UserT();
        userT.setUsername("  javaniuniu  ");
        userT.setPassword("1234562");
        userT.setRealName("java牛牛");
        userT.setCreateTime(new Date());
        userT.setUpdateTime(new Date());
        userT.setEmail("king101125s@gmail.com");
        userT.setMobile("18620668927");
        userTRepository.save(userT);
        log.info("插入成功");
    }

    @Test //测试 @CreationTimestamp
    public void saveUseT2() {
        UserT userT = new UserT();
        userT.setUsername("javaniuniu");
        userT.setPassword("1234562");
        userT.setRealName("java牛牛");
//        userT.setCreateTime(new Date());
//        userT.setUpdateTime(new Date());
        userTRepository.save(userT);
        log.info("插入成功");
    }

    @Test //测试 @UpdateTimestamp
    public void updateUseT() {
        UserT userT = new UserT();
        userT.setId(1012);
        userT.setUsername("javaniuniu");
        userT.setPassword("1234562");
        userT.setRealName("java牛牛2");
        userT.setCreateTime(new Date());
//        userT.setUpdateTime(new Date());
        userTRepository.save(userT);
        log.info("插入成功");
    }


    @Test// 测试@DynamicUpdate
    public void updatePassword() {
        UserT userT = new UserT();
        userT.setId(978);
        userT.setUsername("javaniuniu");
        userT.setPassword("11223344");
        userT.setRealName("java牛牛");
        userTRepository.save(userT);
    }

    @Test// 测试findById
    public void updateUsername() {
        UserT userT = userTRepository.findById(985).get();
        userT.setUsername("javaniuniu");
        userTRepository.save(userT);
    }

    @Test//测试 getOne
    @Transactional
    public void updateRealName() {
        UserT userT = userTRepository.getOne(984);
        userT.setRealName("java牛牛");
        userTRepository.save(userT);
    }

    @Test//测试 findAll
    public void findRealName() {
        UserT userT = new UserT();
        userT.setRealName("java牛牛");
        Example<UserT> userTExample = Example.of(userT);
        List<UserT> userL = userTRepository.findAll(userTExample);
        Assert.assertEquals(userL.size(), 2);
        log.info(String.valueOf(userL.size()));
    }


}

/*
update @DynamicUpdate(true)
开始测试-----------------
Hibernate: select usert0_.id as id1_0_0_, usert0_.create_time as create_t2_0_0_, usert0_.password as password4_0_0_, usert0_.real_name as real_nam5_0_0_, usert0_.update_time as update_t3_0_0_, usert0_.username as username6_0_0_ from t_user usert0_ where usert0_.id=?
Hibernate: update t_user set create_time=?, password=?, update_time=? where id=?
测试结束-----------------
 */

/*
update @DynamicUpdate(false)
开始测试-----------------
Hibernate: select usert0_.id as id1_0_0_, usert0_.create_time as create_t2_0_0_, usert0_.password as password4_0_0_, usert0_.real_name as real_nam5_0_0_, usert0_.update_time as update_t3_0_0_, usert0_.username as username6_0_0_ from t_user usert0_ where usert0_.id=?
Hibernate: update t_user set create_time=?, password=?, real_name=?, update_time=?, username=? where id=?
测试结束-----------------
 */

/*
insert @DynamicInsert(true)
开始测试-----------------
Hibernate: insert into t_user (create_time, password, real_name, username) values (?, ?, ?, ?)
2020-02-26 21:45:47.100  INFO 30861 --- [           main] com.javaniuniu.jpa.model.UserTTest       : 插入成功
测试结束-----------------
 */

/*
insert @DynamicInsert(false)
开始测试-----------------
Hibernate: insert into t_user (create_time, password, real_name, update_time, username) values (?, ?, ?, ?, ?)
2020-02-26 21:47:54.796  INFO 30872 --- [           main] com.javaniuniu.jpa.model.UserTTest       : 插入成功
测试结束-----------------
 */