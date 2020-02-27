package com.javaniuniu.transactional.model;

import com.javaniuniu.transactional.validate.Email;
import com.javaniuniu.transactional.validate.Mobile;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/27 3:52 PM
 * 系统用户
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "sys_user")
public class SysUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "avatar")
    private String avatar;

    @NotNull
    @Column(name = "password")
    private String password;

    @Column(name = "salt")
    private String salt;

    @Email
    @Column(name = "email")
    private String email;

    @Mobile
    @Column(name = "mobile")
    private String mobile;

    @Column(name = "status")
    private Byte status;

    //    @ManyToOne
//    @JoinColumn(name = "dept_id")
    @Column(name = "dept_id")
    private Long deptId;

    @Column(name = "create_by")
    private String createBy;

    @CreationTimestamp
    @Column(name = "create_time", columnDefinition = "datetime")
    private Date createTime;

    @Column(name = "last_update_by")
    private String lastUpdateBy;

    @UpdateTimestamp
    @Column(name = "last_update_time", columnDefinition = "datetime")
    private Date lastUpdateTime;

    @Column(name = "del_flag")
    private Byte delFlag;
}
