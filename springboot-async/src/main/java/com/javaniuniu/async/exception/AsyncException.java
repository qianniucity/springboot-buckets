package com.javaniuniu.async.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/23 9:42 AM
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AsyncException extends RuntimeException {
    /**
     * 错误代码
     */
    private int code;

    public AsyncException() {
        super();
    }

    public AsyncException(String msg) {
        super(msg);
    }

    public AsyncException(int code, String msg) {
        super(msg);
        this.code = code;
    }
}
