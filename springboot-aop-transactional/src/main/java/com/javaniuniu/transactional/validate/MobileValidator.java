package com.javaniuniu.transactional.validate;

import org.springframework.util.ObjectUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;


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