package com.javaniuniu.validate;

import org.springframework.util.ObjectUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;


/**
 * 手机号码正则
 *
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/29 12:43 PM
 */
public class MobileValidator implements ConstraintValidator<Mobile, String> {

    private String moneyReg = "^1\\d{10}$";
    private Pattern moneyPattern = Pattern.compile(moneyReg);

    @Override
    public void initialize(Mobile mobile) {


    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext arg1) {
        if (ObjectUtils.isEmpty(value)) {
            return true;
        }
        return moneyPattern.matcher(value).matches();
    }

}  