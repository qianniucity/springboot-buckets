package com.javaniuniu.transactional.service.impl;

import com.javaniuniu.transactional.annotation.AopTransaction;
import com.javaniuniu.transactional.dao.SysDepartmentDao;
import com.javaniuniu.transactional.model.SysDepartment;
import com.javaniuniu.transactional.service.SysDepartmentService;
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
public class SysDepartmentServiceImpl implements SysDepartmentService {
//    @Autowired
//    SysDepartmentRepository sysDepartmentRepository;

    @Autowired
    private SysDepartmentDao departmentDao;

    @Override
    @AopTransaction(name = "save", functionName = "save()", className = "SysDepartmentServiceImpl.java")
    public void save(SysDepartment department) {
        departmentDao.save(department);
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void delete(String id) {
        departmentDao.delete(id);
    }

    @Override
    public List<SysDepartment> findAll() {
        return departmentDao.findAll();
    }
}
