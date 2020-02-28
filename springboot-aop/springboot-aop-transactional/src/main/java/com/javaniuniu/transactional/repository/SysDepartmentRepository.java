package com.javaniuniu.transactional.repository;

import com.javaniuniu.transactional.model.SysDepartment_jpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/28 12:25 PM
 */
@Repository
public interface SysDepartmentRepository extends JpaRepository<SysDepartment_jpa,Long> {
}
