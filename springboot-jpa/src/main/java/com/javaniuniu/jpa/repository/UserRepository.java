package com.javaniuniu.jpa.repository;

import com.javaniuniu.jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/26 12:42 PM
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
