package com.javaniuniu.exception.util;

/***
 * 异常代码 值
 */

public enum ErrorCodeEnum {


    FAIL("系统异常,操作失败!", "1"),
    SUCCESS("操作成功!", "0"),
    FAIL_RUNTIME_EXPS("空指针异常!", "401"),
    FAIL_PARAMS_EXP("请求参数匹配错误", "402");

    private String message;
    private String code;

    ErrorCodeEnum(String message, String code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
