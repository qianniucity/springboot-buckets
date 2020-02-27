package com.javaniuniu.transactional.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/27 7:23 PM
 */
@ControllerAdvice
@RestController
@Slf4j
public class GlobalException {

    /**
     * 参数校验失败的全局异常处理
     *
     * @param e
     * @return
     */
    // 自定义request状态码
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = {BindException.class})
    public Map<String, String> handlerArgsBindException(BindException e) {
        List<ObjectError> errors = e.getAllErrors();
        Map<String, String> map = new HashMap<>();
        errors.forEach(error -> map.put(error.getObjectName(), error.getDefaultMessage()));
        log.info(errors.get(0).getDefaultMessage());
        return map;
    }

}
