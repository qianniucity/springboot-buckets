package com.javaniuniu.jpa.validate;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用户名相关验证
 * 4到16位（字母，数字，下划线，减号）
 */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UserNameValidator.class)
public @interface UserName {

    String message() default "用户名格式不正确!4到16位(字母,数字,下划线,减号)";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}  