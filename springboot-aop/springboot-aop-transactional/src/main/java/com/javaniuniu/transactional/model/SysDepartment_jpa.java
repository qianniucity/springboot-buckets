//package com.javaniuniu.transactional.model;
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.UpdateTimestamp;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.util.Date;
//
///**
// * @Author: java牛牛
// * @Web: http://javaniuniu.com
// * @GitHub https://github.com/minplemon
// * @Date: 2020/2/27 3:42 PM
// * 系统部门
// */
//@Getter
//@Setter
//@NoArgsConstructor
//@Entity
//@Table(name = "sys_department")
//public class SysDepartment_jpa implements Serializable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "name", unique = true)
//    private String name;
//
//    @Column(name = "nick_name")
//    private String nickName;
//
//    @Column(name = "create_by")
//    private String createBy;
//
//    @CreationTimestamp
//    @Column(name = "create_time", columnDefinition = "datetime")
//    private Date createTime;
//
//    @Column(name = "last_update_by")
//    private String lastUpdateBy;
//
//    @UpdateTimestamp
//    @Column(name = "last_update_time", columnDefinition = "datetime")
//    private Date lastUpdateTime;
//
//    @Column(name = "del_flag")
//    private Byte delFlag;
//}
