package com.example.rabbitmqfanoutdemo.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(String name){
        String str = "hello,"+name;
        amqpTemplate.convertAndSend("amq.fanout","",str);
    }
}
