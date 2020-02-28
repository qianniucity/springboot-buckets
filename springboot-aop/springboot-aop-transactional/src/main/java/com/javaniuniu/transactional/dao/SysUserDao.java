package com.javaniuniu.transactional.dao;

import com.javaniuniu.transactional.model.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/28 7:07 PM
 */
@Slf4j
@Repository
public class SysUserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 保存用户
     *
     * @param user
     */
    public void save(SysUser user) {
        String sql = "insert into sys_user(`name`,nick_name,avatar,`password`,salt,email,mobile,`status`,dept_id,create_by,create_time,last_update_by,last_update_time,del_flag)" +
                "value(?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        jdbcTemplate.update(sql,
                user.getName(), user.getNickName(), user.getAvatar(),
                user.getPassword(),user.getSalt(),user.getEmail(),user.getMobile(),
                user.getStatus(),user.getDeptId(),user.getCreateBy(),user.getCreateTime(),
                user.getLastUpdateBy(),user.getLastUpdateTime(),user.getDelFlag());
        if (log.isDebugEnabled()) {
            log.debug("JDBC SQL->" + sql);
        }
    }

    /**
     * 删除用户
     *
     * @param id
     */
    public void delete(String id) {
        String sql = "delete from sys_user where id=?";
        jdbcTemplate.update(sql, id);
        if (log.isDebugEnabled()) {
            log.debug("JDBC SQL->" + sql);
        }
    }

    /**
     * 查询全部用户
     *
     * @return
     */
    public List<SysUser> findAll() {
        String sql = "select * from sys_user";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper(SysUser.class));
    }
}