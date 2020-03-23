package com.example.rabbitmqtopicdemo.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        //交换机名字，匹配符，内容
        amqpTemplate.convertAndSend("amq.topic","queue02.hahaha","hello");
    }
}
