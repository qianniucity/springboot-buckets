package com.javaniuniu.restful.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/3/4 9:32 AM
 */
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    @NonNull
    private Integer id;
    @NonNull
    private String name;
    @NonNull
    private String password;

    @JsonManagedReference
    private List<Address> addresses;
}
