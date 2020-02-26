package com.javaniuniu.jpa.repository;

import com.javaniuniu.jpa.model.UserT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/26 11:21 AM
 */
@Repository
public interface UserTRepository extends JpaRepository<UserT,Integer> {

}
