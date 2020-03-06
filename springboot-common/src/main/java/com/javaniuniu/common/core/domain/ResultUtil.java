package com.javaniuniu.common.core.domain;

import com.alibaba.fastjson.JSON;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;



/***
 *  对返回给前端的数据进行格式封装处理
 */
public class ResultUtil {
    /**
     * 将json输出到前端(参数非json格式)
     *
     * @param response
     * @param obj
     *         任意类型
     */
    public static void writeJavaScript(HttpServletResponse response, Object obj) {
        response.setContentType("application/json;charset=UTF-8");
        response.setHeader("Cache-Control", "no-store, max-age=0, no-cache, must-revalidate");
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        response.setHeader("Pragma", "no-cache");
        /* 设置浏览器跨域访问 */
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS,DELETE,PUT");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        try {
            PrintWriter out = response.getWriter();
            out.write(JSON.toJSONString(obj));
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 将数据输出给前端
     *
     * @param response
     * @param obj
     */
    public static void writeJavaScript(HttpServletResponse response, String errorCode, Object obj) {
        MsgResponseBody msgResponseBody = MsgResponseBody.error(errorCode).setResult(obj);
        writeJavaScript(response, msgResponseBody);
    }

    /**
     * 将数据输出给前端
     *
     * @param response
     * @param errorCode
     */
    public static void writeJavaScript(HttpServletResponse response, String errorCode) {
        MsgResponseBody msgResponseBody = MsgResponseBody.error(errorCode);
        writeJavaScript(response, msgResponseBody);
    }

}