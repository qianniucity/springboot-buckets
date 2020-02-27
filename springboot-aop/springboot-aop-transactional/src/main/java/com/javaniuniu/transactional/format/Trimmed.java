package com.javaniuniu.transactional.format;

import java.lang.annotation.*;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/27 5:38 PM
 * 清除字符串前后的空格
 */
@Target(value = {ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Trimmed {
    public static enum TrimmerType {
        SIMPLE, ALL_WHITESPACES, EXCEPT_LINE_BREAK;
    }

    TrimmerType value() default TrimmerType.ALL_WHITESPACES;
}
