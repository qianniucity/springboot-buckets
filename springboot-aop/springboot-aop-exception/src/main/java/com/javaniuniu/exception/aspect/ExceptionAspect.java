package com.javaniuniu.exception.aspect;

import com.javaniuniu.exception.annotation.ParamValidate;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import java.lang.reflect.Method;
import java.util.List;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/27 11:05 PM
 * 异常处理切面
 */
@Slf4j
@Aspect
@Component
public class ExceptionAspect {

    @Before("@annotation(com.javaniuniu.exception.annotation.ParamValidate)")
    public void before(JoinPoint jp) throws Exception {
        doBefore(jp);
    }

    private void doBefore(JoinPoint jp) throws Exception {
        if (getParamValidate(jp) == null) {
            return;
        }
        Object[] args = jp.getArgs();
        if (args == null) {
            return;
        }
        //将异常格式化成通用格式
        formateException(args);
    }

    private ParamValidate getParamValidate(JoinPoint jp) {
        MethodSignature methodSignature = (MethodSignature) jp.getSignature();
        Method method = methodSignature.getMethod();
        return method.getAnnotation(ParamValidate.class);
    }

    private void formateException(Object[] args) throws Exception {
        for (Object arg : args) {
            if (arg instanceof BindingResult) {
                BindingResult result = (BindingResult) arg;
                if (result != null && result.getErrorCount() > 0) {
                    List<ObjectError> errors = result.getAllErrors();
                    String errorMsg = "";
                    for (ObjectError error : errors) {
                        if (error instanceof FieldError) {
                            FieldError fe = (FieldError) error;
                            errorMsg = String.format("%s:%s", fe.getField(), error.getDefaultMessage());
                        } else {
                            errorMsg = String.format("%s:%s ", error.getCode(), error.getDefaultMessage());
                        }
                        log.error(errorMsg);
                        throw new Exception(errorMsg);
                    }
                }
            }
        }
    }
}
