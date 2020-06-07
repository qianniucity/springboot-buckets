package com.javaniuniu.topic;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @auther: javaniuniu
 * @date: 2020/6/7 2:14 PM
 */
public class Producer {
    private final static String EXCHANGE_NAME = "topic_exchange";

    // 发送信息
    public static void main(String[] args) throws IOException, TimeoutException {
        // 1.创建链接
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("127.0.0.1");
        connectionFactory.setPort(5672);
        connectionFactory.setUsername("dubbo");
        connectionFactory.setPassword("123");
        connectionFactory.setVirtualHost("/dubbo");
        Connection connection = connectionFactory.newConnection();

        // 2.基于链接对象创建 Channel
        Channel channel = connection.createChannel();

        // 3. 声明交换机
        /**
         * var1 交换机名称
         * var2 交换机类型
         */
        channel.exchangeDeclare(EXCHANGE_NAME,"topic");



        // 4. 发送信息
        String message = "重大的足球消息";
        channel.basicPublish(EXCHANGE_NAME,"tiyu.football",null,message.getBytes());

        String message2 = "重大的篮球消息";
        channel.basicPublish(EXCHANGE_NAME,"tiyu.basketball",null,message2.getBytes());

        String message3 = "CBA消息";
        channel.basicPublish(EXCHANGE_NAME,"tiyu.basketball.cba",null,message3.getBytes());

        System.out.println("发送信息成功");


    }

}
