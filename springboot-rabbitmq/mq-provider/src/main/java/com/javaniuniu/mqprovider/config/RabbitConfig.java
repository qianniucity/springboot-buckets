package com.javaniuniu.mqprovider.config;

import com.javaniuniu.base.contant.MQConstant;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @auther: javaniuniu
 * @date: 2020/6/7 4:48 PM
 */


@Configuration
public class RabbitConfig {

    @Bean
    public TopicExchange initProductExchange(){
        TopicExchange productExchange = new TopicExchange(
                MQConstant.EXCHANGE.CENTER_PRODUCT_EXCHEANGE,true,false);
        return productExchange;
    }
}