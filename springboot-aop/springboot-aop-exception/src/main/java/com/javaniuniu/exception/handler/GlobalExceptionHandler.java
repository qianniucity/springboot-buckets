package com.javaniuniu.exception.handler;

import com.javaniuniu.exception.commons.MsgResponseBody;
import com.javaniuniu.exception.commons.ErrorCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/27 11:10 PM
 * 全局异常处理
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public MsgResponseBody<Object> handleException(Exception e) {

        if (e instanceof NullPointerException) {
            return MsgResponseBody.error(ErrorCodeEnum.FAIL_NULLPOINT_EXP.getCode()).setResult(ErrorCodeEnum.FAIL_NULLPOINT_EXP.getMessage());

        } else if (e instanceof HttpMessageNotReadableException) {
            MsgResponseBody.error(ErrorCodeEnum.FAIL_PARAMS_EXP.getCode()).setResult(ErrorCodeEnum.FAIL_PARAMS_EXP.getMessage());

        } else {
            return MsgResponseBody.error("100000").setResult("其他错误"+e);

        }
        return null;
    }


}
