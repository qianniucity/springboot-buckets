package com.javaniuniu.format.annotation;

import java.lang.annotation.*;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/27 9:24 PM
 * 参数收尾字段去空
 */
@Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface TrimParam {
    /**
     * 字段名称
     *
     * @return String
     */
    String name() default "";
}
