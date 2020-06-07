package com.javaniuniu.work;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import static com.sun.tools.doclint.Entity.or;

/**
 * @auther: javaniuniu
 * @date: 2020/6/7 2:14 PM
 */
public class Producer {
    private final static String QUEUE_NAME = "work_queue";

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

        // 3. 声明一个队列
        // 如果队列不存在，则创建该队列，否则，不创建
        channel.queueDeclare(QUEUE_NAME,false,false,false,null);

        // 4. 发送信息
        for (int i =0 ;i<10;i++) {
            String message = "这是第 "+ i+"遍说我爱你";
            channel.basicPublish("",QUEUE_NAME,null,message.getBytes());
        }

        System.out.println("发送信息成功");


    }

}
