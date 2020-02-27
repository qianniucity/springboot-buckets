package com.javaniuniu.exception.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/28 12:09 AM
 */
@Setter
@Getter
@Entity
@NoArgsConstructor
@DynamicUpdate
@Table(name = "t_user")
public class User implements Serializable {
    /**
     * 数据序号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull(message = "用户名不能为空")
    @Column(name = "username")
    private String name;

    @NotNull(message = "手机号不能为空")
    @Column(name = "mobile")
    private String mobile;
}
