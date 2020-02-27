package com.javaniuniu.jpa.validate;

import org.springframework.util.ObjectUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

/**
 * 邮箱格式正则
 */
public class EmailValidator implements ConstraintValidator<Email, String> {

    private String moneyReg = "^([A-Za-z0-9_\\-\\.])+\\@([A-Za-z0-9_\\-\\.])+\\.([A-Za-z]{2,4})$";
    private Pattern moneyPattern = Pattern.compile(moneyReg);

    @Override
    public void initialize(Email email) {


    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext arg1) {
        if (ObjectUtils.isEmpty(value)) {
            return true;
        }
        return moneyPattern.matcher(value).matches();
    }

}  