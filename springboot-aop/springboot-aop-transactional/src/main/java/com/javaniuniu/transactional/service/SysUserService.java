package com.javaniuniu.transactional.service;

import com.javaniuniu.transactional.model.SysUser;

import java.util.List;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/28 12:26 PM
 */
public interface SysUserService {
    /**
     * 保存用户
     * @param user
     */
    void save(SysUser user);

    /**
     * 删除用户
     * @param id
     */
    void delete(String id);

    /**
     * 查询全部用户
     * @return
     */
    List<SysUser> findAll();

}
