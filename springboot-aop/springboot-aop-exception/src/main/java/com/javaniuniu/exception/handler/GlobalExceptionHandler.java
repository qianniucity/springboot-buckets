package com.javaniuniu.exception.handler;

import com.javaniuniu.exception.VO.ResultVo;
import com.javaniuniu.exception.util.ErrorCodeEnum;
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
    public ResultVo<Object> handleException(Exception e) {
        String errorMsg = "";
        String errorCode = "";
        if (e instanceof NullPointerException) {
            errorCode = ErrorCodeEnum.FAIL_RUNTIME_EXPS.getCode();
            errorMsg = ErrorCodeEnum.FAIL_RUNTIME_EXPS.getMessage();
        } else if (e instanceof HttpMessageNotReadableException) {
            errorCode = ErrorCodeEnum.FAIL_PARAMS_EXP.getCode();
            errorMsg = ErrorCodeEnum.FAIL_PARAMS_EXP.getMessage() + e.getLocalizedMessage();
        } else {
            errorCode = "501";
            errorMsg = "未知错误"+ e.getMessage();
        }
        log.error(String.format("请求异常[%s]", e));

        ResultVo<Object> resultVo = new ResultVo<>();
        resultVo.setResultCode(errorCode);
        resultVo.setResultMsg(errorMsg);
        return resultVo;
    }
}
