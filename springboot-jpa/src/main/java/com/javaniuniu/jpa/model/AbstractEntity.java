package com.javaniuniu.jpa.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/26 10:23 AM
 */
@Data
@MappedSuperclass //不能同时出现@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class AbstractEntity implements Serializable {
    private static final long serialVersionUID = 892959258661987705L;
    /**
     * 数据序号
     * //
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "update_time", columnDefinition = "datetime")
    private Date updateTime;

    @Column(name = "create_time", columnDefinition = "datetime")
    private Date createTime;
}
