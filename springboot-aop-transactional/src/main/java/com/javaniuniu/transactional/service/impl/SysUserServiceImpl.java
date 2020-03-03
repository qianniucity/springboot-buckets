package com.javaniuniu.transactional.service.impl;

import com.javaniuniu.transactional.annotation.AopTransaction;
import com.javaniuniu.transactional.dao.SysUserDao;
import com.javaniuniu.transactional.model.SysUser;
import com.javaniuniu.transactional.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/28 12:28 PM
 */
@Service
public class SysUserServiceImpl implements SysUserService {
//    @Autowired
//    SysUserRepository sysUserRepository;

    @Autowired
    private SysUserDao sysUserDao;

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void save(SysUser user) {
        sysUserDao.save(user);
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void delete(String id) {
        sysUserDao.delete(id);
    }

    @Override
    @AopTransaction(name = "find", functionName = "findAll()", className = "SysUserServiceImpl.java")
    public List<SysUser> findAll() {
        return sysUserDao.findAll();
    }

}
