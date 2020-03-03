package com.javaniuniu.format.handler;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Field;
import java.util.Objects;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/3/3 8:10 PM
 * 描述: 去除首尾空格处理实现
 */
@Component
@Aspect
public class TrimInterceptor implements HandlerInterceptor {

    /**
     * 环绕处理
     *
     * @param proceedingJoinPoint 连接点
     * @return 结果
     * @throws Throwable 异常
     */
    @Around(value = "@annotation(com.javaniuniu.format.annotation.Trim)")//注解的全限定名称
    public Object trimAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // 获取入参
        Object[] objects = proceedingJoinPoint.getArgs();
        if (Objects.nonNull(objects) && objects.length > 0) {
            // 处理接口传参：去除首尾空格
            for (int i = 0, len = objects.length; i < len; i++) {
                objects[i] = trimExe(objects[i]);
            }
        }
        // 继续执行controller层
        return proceedingJoinPoint.proceed(objects);
    }

    /**
     * 处理所有类型参数，包括基本数据类型与vo等对象，去除首尾空格
     *
     * @param object 对象
     * @return 结果
     * @throws IllegalAccessException 异常
     */
    private static Object trimExe(Object object) throws IllegalAccessException {
        // 对象为空，不做处理
        if (Objects.isNull(object)) {
            return object;
        }

        Class<? extends Object> clazz = object.getClass();
        // 为非String包装类型，不做处理
        if (clazz == Boolean.class || clazz == Short.class || clazz == Integer.class || clazz == Long.class || clazz == Float.class || clazz == Double.class) {
            return object;
        }
        if (clazz == String.class) {
            return object.toString().trim();
        }

        // 字段为private时，无法修改字段值，需要反射
        Field[] fields = clazz.getDeclaredFields();

        // 没有字段
        if (Objects.isNull(fields) || fields.length == 0) {
            return object;
        }

        for (Field field : fields) {
            Class<?> filedType = field.getType();
            // 只处理字符串类型
            if (filedType != String.class) {
                continue;
            }
            //去除private权限，变为可更改
            field.setAccessible(true);
            //field.get(object) 返回参数对于的值
            if (Objects.nonNull(field.get(object))) {
                // 在原有的对象上设置去除首尾空格的新值
                field.set(object, String.valueOf(field.get(object)).trim());
            }

        }
        return object;
    }


    /**
     * 预处理回调方法：在请求处理之前进行调用
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //不需要前置处理
        return false;
    }

    /**
     * 后处理回调方法
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    /**
     * 后置处理
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
