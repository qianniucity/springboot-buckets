package com.javaniuniu.transactional.dao;

import com.javaniuniu.transactional.model.SysDepartment;
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
public class SysDepartmentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 保存部門
     *
     * @param department
     */
    public void save(SysDepartment department) {
        String sql = "insert into sys_department(`name`,nick_name,create_by,create_time,last_update_by,last_update_time,del_flag)" +
                "value(?,?,?,?,?,?,?);";
        jdbcTemplate.update(sql,
                department.getName(), department.getNickName(), department.getCreateBy(), department.getCreateTime(),
                department.getLastUpdateBy(), department.getLastUpdateTime(), department.getDelFlag());
        if (log.isDebugEnabled()) {
            log.debug("JDBC SQL->" + sql);
        }
    }

    /**
     * 删除部門
     *
     * @param id
     */
    public void delete(String id) {
        String sql = "delete from sys_department where id=?";
        jdbcTemplate.update(sql, id);
        if (log.isDebugEnabled()) {
            log.debug("JDBC SQL->" + sql);
        }
    }

    /**
     * 查询全部部門
     *
     * @return
     */
    public List<SysDepartment> findAll() {
        String sql = "select * from sys_department";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper(SysDepartment.class));
    }
}