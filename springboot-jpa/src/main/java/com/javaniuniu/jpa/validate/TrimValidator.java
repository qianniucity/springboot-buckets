package com.javaniuniu.jpa.validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/27 8:30 PM
 */
public class TrimValidator implements ConstraintValidator<Trim, String> {
    private String name = "";

    @Override
    public void initialize(Trim constraintAnnotation) {
        //去空操作
        name = constraintAnnotation.name().trim();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return true;
    }
}
