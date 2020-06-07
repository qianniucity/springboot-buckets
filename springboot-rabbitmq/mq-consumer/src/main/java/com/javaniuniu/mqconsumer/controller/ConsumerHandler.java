package com.javaniuniu.mqconsumer.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @auther: javaniuniu
 * @date: 2020/6/7 1:32 PM
 */
@Component
@RabbitListener(queues = "v5_simple_queue")
public class ConsumerHandler {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void process() {
        rabbitTemplate.convertAndSend("v5_simple_queue",
                "Springboot整合rabbitmq成功");
    }

}
