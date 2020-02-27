package com.javaniuniu.jpa.model;

import com.javaniuniu.jpa.validate.Email;
import com.javaniuniu.jpa.validate.Mobile;
import com.javaniuniu.jpa.validate.Trim;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/26 12:21 PM
 */
@Setter
@Getter
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "t_user")
public class UserT implements Serializable {
    private static final long serialVersionUID = 892959258661987705L;
    /**
     * 数据序号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @UpdateTimestamp
    @Column(name = "update_time", columnDefinition = "datetime")
    private Date updateTime;

    @CreationTimestamp
    @Column(name = "create_time", columnDefinition = "datetime", updatable = false)
    private Date createTime;

    @NotNull
    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @NotNull
    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "real_name")
    private String realName;

    @Email
    @Column(name = "email")
    private String email;

    @Mobile
    @Column(name = "mobile")
    private String mobile;

}
