package com.javaniuniu.cache.dao.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/24 10:17 AM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "t_user")
public class User extends Model<User> {
    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    private String username;

    private String password;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
