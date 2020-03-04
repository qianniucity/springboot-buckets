package com.javaniuniu.restful.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import java.io.Serializable;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/3/4 9:32 AM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address implements Serializable {
    private Integer id;
    private String home;
    private String school;
    @JsonBackReference
    private User user;
}
