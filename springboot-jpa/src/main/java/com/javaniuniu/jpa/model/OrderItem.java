package com.javaniuniu.jpa.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/27 9:03 AM
 * 订单关联明细
 */
@Setter
@Getter
@Entity
@Table(name = "t_orderitem")
public class OrderItem extends AbstractEntity {


    @ManyToOne //多个订单明细关联一个订单列表
    @JoinColumn(name = "order_id")
    private Order order;

    @Column(columnDefinition = "INT(11) NOT NULL COMMENT '订单数量'")
    private Integer quantity;
}
