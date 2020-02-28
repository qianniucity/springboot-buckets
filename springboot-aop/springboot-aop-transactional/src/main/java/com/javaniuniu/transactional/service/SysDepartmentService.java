package com.javaniuniu.transactional.service;

import com.javaniuniu.transactional.model.SysDepartment;

import java.util.List;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/28 12:27 PM
 */
public interface SysDepartmentService {
    /**
     * 保存部門
     * @param department
     */
    void save(SysDepartment department);

    /**
     * 删除部門
     * @param id
     */
    void delete(String id);

    /**
     * 查询全部部門
     * @return
     */
    List<SysDepartment> findAll();
}
