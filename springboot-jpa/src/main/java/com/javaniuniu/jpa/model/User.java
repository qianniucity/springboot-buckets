package com.javaniuniu.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * (TUser)实体类
 *
 * @author javaniuniu
 * @since 2020-02-26 10:09:15
 */
@Setter
@Getter
@Entity
@NoArgsConstructor
@DynamicUpdate
@Table(name = "t_user")
public class User extends AbstractEntity {

    @Column(columnDefinition = "VARCHAR(32) DEFAULT NULL COMMENT '账号(暂时没用)'")
    private String account;

    @NotNull
    @Column(name = "password", columnDefinition = "VARCHAR(64) NOT NULL COMMENT '密码'")
    private String password;

    @NotNull
    @NumberFormat
    @Column(name = "username", columnDefinition = "VARCHAR(32) NOT NULL COMMENT '用户名'")
    private String username;

    @Column(name = "real_name", columnDefinition = "VARCHAR(32) NOT NULL COMMENT '真实姓名'")
    private String realName;

    @Column(columnDefinition = "DOUBLE DEFAULT 0 NOT NULL COMMENT '账户余额'")
    private Long balance;

    @Column(columnDefinition = "DOUBLE DEFAULT 0 NOT NULL COMMENT '积分值'")
    private Long point;

    @Column(columnDefinition = "VARCHAR(32) DEFAULT NULL COMMENT '手机号码'")
    private String phone;

    @Column(columnDefinition = "VARCHAR(32) DEFAULT NULL COMMENT '座机电话'")
    private String telPhone;

    @Column(columnDefinition = "VARCHAR(64) DEFAULT NULL COMMENT '地址'")
    private String address;

    @Column(columnDefinition = "VARCHAR(16) DEFAULT NULL COMMENT '邮编'")
    private String zipCode;

    @Column(columnDefinition = "VARCHAR(32) DEFAULT NULL COMMENT '备注'")
    private String remark;

    /**
     * 订单
     */
    @OneToMany(mappedBy = "user")
    private List<Order> orders;


}