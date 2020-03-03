package com.javaniuniu.transactional.repository;

import com.javaniuniu.transactional.model.SysUser_jpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/28 12:24 PM
 */
@Repository
public interface SysUserRepository extends JpaRepository<SysUser_jpa, Long> {
}
