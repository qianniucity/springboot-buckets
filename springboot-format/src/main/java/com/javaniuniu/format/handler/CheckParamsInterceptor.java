package com.javaniuniu.format.handler;

import com.alibaba.fastjson.JSONObject;
import com.javaniuniu.format.annotation.ParamsNotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/27 9:50 PM
 */
@Slf4j
public class CheckParamsInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        if (!(handler instanceof HandlerMethod)) {
            log.warn("UnSupport handler");
            return true;
        }
        //拿到该方法上加了注解的参数名称
        List<String> list = getParamsName((HandlerMethod) handler);
        for (String s : list) {
            //获取到参数名称并判断是否为空
            String parameter = request.getParameter(s);
            if (StringUtils.isEmpty(parameter)) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("code", HttpStatus.INTERNAL_SERVER_ERROR);
                jsonObject.put("msg", HttpStatus.valueOf("必传参数错误"));
                response.setHeader("Content-type", MediaType.APPLICATION_JSON_UTF8_VALUE);
                response.getWriter().write(jsonObject.toJSONString());
                return false;
            }
        }
        //如果拿到的对象为空,说明没有此注解,直接放行
        return true;
    }

    /**
     * 拿到在参数上加了该注解的参数名称
     */
    private List getParamsName(HandlerMethod handlerMethod) {
        Parameter[] parameters = handlerMethod.getMethod().getParameters();
        List<String> list = new ArrayList<String>();
        for (Parameter parameter : parameters) {
            if (parameter.isAnnotationPresent(ParamsNotNull.class)) {
                list.add(parameter.getName());
            }
        }
        return list;
    }
}
