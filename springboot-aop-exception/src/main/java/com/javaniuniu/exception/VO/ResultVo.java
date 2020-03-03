package com.javaniuniu.exception.VO;

import lombok.Data;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/27 11:12 PM
 */
@Data
public class ResultVo<T> {
    private String resultCode;

    private String resultMsg;

    private T data;
}
