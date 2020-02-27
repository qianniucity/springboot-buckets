package com.javaniuniu.cache.service;

import com.javaniuniu.cache.dao.entity.User;
import com.javaniuniu.cache.dao.repository.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/24 1:12 PM
 */
@Slf4j
@Service
@Transactional
public class UserService {

    @Resource
    private UserMapper userMapper;

    /**
     * cacheNames 设置缓存的值
     * key：指定缓存的key，这是指参数id值。key可以使用spEl表达式
     *
     * @param id
     * @return
     */
    @Cacheable(value = "userCache", keyGenerator = "myKeyGenerator", key = "#id", unless = "#result == null")
    public User getById(int id) {
        log.info("获取用户start...");
        return userMapper.selectById(id);
    }

    @Cacheable(value = "allUsersCache", keyGenerator = "myKeyGenerator", unless = "#result.size() == 0")
    public List<User> getAllUsers() {
        log.info("获取所有用户列表");
        return userMapper.selectList(null);
    }

    /**
     * 创建用户，同时使用新的返回值的替换缓存中的值
     * 创建用户后会将allUsersCache缓存全部清空
     */
    @Caching(
            put = {@CachePut(value = "userCache", keyGenerator = "myKeyGenerator", key = "#user.id")},
            evict = {@CacheEvict(value = "allUsersCache", keyGenerator = "myKeyGenerator", allEntries = true)}
    )
    public User createUser(User user) {
        log.info("创建用户start..., user.id=" + user.getId());
        userMapper.insert(user);
        return user;
    }

    /**
     * 更新用户，同时使用新的返回值的替换缓存中的值
     * 更新用户后会将allUsersCache缓存全部清空
     */
    @Caching(
            put = {@CachePut(value = "userCache", keyGenerator = "myKeyGenerator", key = "#user.id")},
            evict = {@CacheEvict(value = "allUsersCache", keyGenerator = "myKeyGenerator", allEntries = true)}
    )
    public User updateUser(User user) {
        log.info("更新用户start...");
        userMapper.updateById(user);
        return user;
    }

    /**
     * 对符合key条件的记录从缓存中移除
     * 删除用户后会将allUsersCache缓存全部清空
     */
    @Caching(
            evict = {
                    @CacheEvict(value = "userCache", keyGenerator = "myKeyGenerator", key = "#id"),
                    @CacheEvict(value = "allUsersCache", keyGenerator = "myKeyGenerator", allEntries = true)
            }
    )
    public void deleteById(int id) {
        log.info("删除用户start...");
        userMapper.deleteById(id);
    }
}
