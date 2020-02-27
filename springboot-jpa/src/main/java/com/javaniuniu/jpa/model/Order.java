package com.javaniuniu.jpa.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/27 8:39 AM
 * 订单
 */

@Setter
@Getter
@Entity
@Table(name = "t_order")
public class Order extends AbstractEntity {

    @Column(columnDefinition = "VARCHAR(64) NOT NULL COMMENT '订单编号'")
    private String orderNumber;

    @ManyToOne //多个订单管理一个用户
    @JoinColumn(name = "user_id", columnDefinition = "BIGINT(20) NOT NULL COMMENT '关联客户'")
    private User user;

    @Column(columnDefinition = "VARCHAR(512) NOT NULL COMMENT '收货地址'")
    private String address;

    @Column(columnDefinition = "VARCHAR(16) NOT NULL COMMENT '收货电话'")
    private String phone;

    @Column(columnDefinition = "VARCHAR(8) NOT NULL COMMENT '收货邮编'")
    private String zipcode;

    @Column(columnDefinition = "VARCHAR(16) NOT NULL COMMENT '收货人'")
    private String consignee;

    /**
     * 关联商品
     * 一个订单对应多个订单明细
     */
    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;

    @Column(columnDefinition = "DATETIME DEFAULT COMMENT '付款时间'")
    private Date payTime;//付款时间

    @Column(columnDefinition = "DATETIME DEFAULT COMMENT '发货时间'")
    private Date shipTime;//发货时间

    @Column(columnDefinition = "DATETIME DEFAULT COMMENT '确认收货时间'")
    private Date confirmTime;//确认收货时间

    @Column(columnDefinition = "INT(11) NOT NULL COMMENT '状态'")
    private Integer status;//状态

    @Column(columnDefinition = "DOUBLE NOT NULL COMMENT '实际成交价'")
    private Double finalPrice;//实际成交价

    @Column(columnDefinition = "DOUBLE NOT NULL COMMENT '总价'")
    private Double totalPrice;//总价
}
