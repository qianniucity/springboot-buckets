package com.javaniuniu.jpa.validate;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/27 8:29 PM
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TrimValidator.class)
public @interface Trim {
    String name() default "";

    String message() default "自定义收尾去空失败Trim";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
