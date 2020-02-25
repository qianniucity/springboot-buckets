package com.javaniuniu.cache.config;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.util.DigestUtils;


import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.Arrays;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/24 10:28 AM
 * <p>
 * RedisCacheConfig
 */
@Configuration
@Slf4j
public class RedisCacheConfig {

    @Autowired
    private Environment env;

    //链接配置
    @Bean
    public LettuceConnectionFactory redisConnectionFactory() {
        RedisStandaloneConfiguration redisConf = new RedisStandaloneConfiguration();
        redisConf.setHostName(env.getProperty("spring.redis.host"));
        redisConf.setPort(Integer.parseInt(env.getProperty("spring.redis.port")));
        redisConf.setPassword(RedisPassword.of(env.getProperty("spring.redis.password")));
        return new LettuceConnectionFactory(redisConf);
    }

    @Bean
    public RedisCacheConfiguration cacheConfiguration() {
        RedisCacheConfiguration cacheConfig = RedisCacheConfiguration.defaultCacheConfig()
                //设置默认超过期时间是10分钟
                .entryTtl(Duration.ofSeconds(600))
                .disableCachingNullValues();
        return cacheConfig;
    }

    @Bean
    public RedisCacheManager cacheManager() {
        RedisCacheManager rcm = RedisCacheManager.builder(redisConnectionFactory())
                .cacheDefaults(cacheConfiguration())
                .transactionAware()
                .build();
        return rcm;
    }

    /**
     * 自定义缓存key的生成类实现
     */
    @Bean(name = "myKeyGenerator")
    public KeyGenerator myKeyGenerator() {
        return new KeyGenerator() {
            @Override
            public Object generate(Object target, Method method, Object... params) {
                log.info("自定义缓存，使用第一参数作为缓存key，params = " + Arrays.toString(params));
                StringBuilder sb = new StringBuilder();
                sb.append(target.getClass().getName());
                sb.append(method.getName());
                sb.append("&");
                for (Object obj : params) {
                    if (obj != null) {
                        sb.append(obj.getClass().getName());
                        sb.append("&");
                        sb.append(JSON.toJSONString(obj));

                        sb.append("&");
                    }
                }
                log.info("redis cache key str: " + sb.toString());
                log.info("redis cache key sha256Hex: " + sha256Hex(sb.toString().getBytes()));
//                return sha256Hex(sb.toString().getBytes());
                return DigestUtils.md5DigestAsHex(sb.toString().getBytes());
            }
        };
    }


    /**
     * 　　* 利用java原生的摘要实现SHA256加密
     * 　　* @param bytes 加密后的报文
     * 　　* @return
     *
     */
    public static String sha256Hex(byte[] bytes) {
        MessageDigest messageDigest;
        String encodeStr = "";
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes);
            encodeStr = byte2Hex(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return encodeStr;
    }

    /**
     * 　　* 将byte转为16进制
     * 　　* @param bytes
     * 　　* @return
     *
     */
    private static String byte2Hex(byte[] bytes) {
        StringBuffer stringBuffer = new StringBuffer();
        String temp = null;
        for (int i = 0; i < bytes.length; i++) {
            temp = Integer.toHexString(bytes[i] & 0xFF);
            if (temp.length() == 1) {
                //1得到一位的进行补0操作
                stringBuffer.append("0");
            }
            stringBuffer.append(temp);
        }
        return stringBuffer.toString();
    }


}
