package com.javaniuniu.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * (TUser)实体类
 *
 * @author javaniuniu
 * @since 2020-02-26 10:09:15
 */
@Setter
@Getter
@Entity
@DynamicUpdate
@Table(name = "t_user")
public class User extends AbstractEntity {

    @NotNull
    @Column(name = "username")
    private String username;

    @NotNull
    @Column(name = "password")
    private String password;

    @Column(name="real_name")
    private String realName;

}