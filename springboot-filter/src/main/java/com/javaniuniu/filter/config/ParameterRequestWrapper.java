package com.javaniuniu.filter.config;

import com.alibaba.fastjson.JSON;
import com.google.common.net.HttpHeaders;
import com.javaniuniu.filter.util.StringJsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;


/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/3/2 9:59 PM
 */
@Slf4j
public class ParameterRequestWrapper extends HttpServletRequestWrapper {
    private Map<String, String[]> params = new HashMap<String, String[]>();//保存处理后的参数


    public ParameterRequestWrapper(HttpServletRequest request) throws IOException, ServletException {
        super(request);

        //如无传递类型 则结束
        if (request.getHeader(HttpHeaders.CONTENT_TYPE) == null) {
            throw new ServletException("请求头不能为空");
        }

        if (request.getMethod().equals("GET")) {
            setParams(request);
        }
        if (request.getMethod().equals("POST")) {
            String json = IOUtils.toString(super.getInputStream());
            if (StringUtils.isEmpty(json)) {
                setParams(request);
            }
        }
    }

    private void setParams(HttpServletRequest request) {
        //将参数表，赋予给当前的Map以便于持有request中的参数
        Map<String, String[]> requestMap = request.getParameterMap();
        log.info("kv转化前参数：" + JSON.toJSONString(requestMap));
        this.params.putAll(requestMap);
        this.modifyParameterValues();
        log.info("kv转化后参数：" + JSON.toJSONString(params));
    }


    /**
     * 重写getInputStream方法  post类型的请求参数必须通过流才能获取到值
     * 这种获取的参数的方式针对于内容类型为文本类型，比如Content-Type:text/plain,application/json,text/html等
     * 在springmvc中可以使用@RequestBody 来获取 json数据类型
     * 其他文本类型不做处理，重点处理json数据格式
     * getInputStream() ，只有当方法为post请求，且参数为json格式是，会被默认调用
     */
    @Override
    public ServletInputStream getInputStream() throws IOException {
        //
        if (!super.getHeader(HttpHeaders.CONTENT_TYPE).equalsIgnoreCase(MediaType.APPLICATION_JSON_VALUE)) {
//            throw new IOException("只支持 header为 application/json 的请求");
            return super.getInputStream();
        }
        //为空，直接返回
        String json = IOUtils.toString(super.getInputStream());
        if (StringUtils.isEmpty(json)) {
//            throw new IOException("参数为空");
            return super.getInputStream();
        }
        log.info("json转化前参数：" + json);
        Map<String, Object> map = StringJsonUtils.jsonString2Map(json);
        log.info("json转化后参数：" + JSON.toJSONString(map));
        ByteArrayInputStream bis = new ByteArrayInputStream(JSON.toJSONString(map).getBytes("utf-8"));
        return new MyServletInputStream(bis);
    }


    /**
     * 将parameter的值去除空格后重写回去
     */
    public void modifyParameterValues() {
        Set<String> set = params.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            String[] values = params.get(key);
            values[0] = values[0].trim();
            params.put(key, values);
        }

    }

    /**
     * 重写getParameter 参数从当前类中的map获取
     */
    @Override
    public String getParameter(String name) {
        String[] values = params.get(name);
        if (values == null || values.length == 0) {
            return null;
        }
        return values[0];
    }

    /**
     * 重写getParameterValues
     */
    @Override
    public String[] getParameterValues(String name) {//同上
        return params.get(name);
    }

    /**
     * 重写getParameterMap
     */
    @Override
    public Map<String, String[]> getParameterMap() {
        //将参数表，赋予给当前的Map以便于持有request中的参数
        Map<String, String[]> requestMap = super.getParameterMap();
        log.info("kv转化前参数：" + JSON.toJSONString(requestMap));
        this.params.putAll(requestMap);
        this.modifyParameterValues();
        log.info("kv转化后参数：" + JSON.toJSONString(params));
        return params;
    }
}
