package com.example.rabbitmqdirectdemo.reciver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "queue")
public class Receiver {
    @RabbitHandler
    public void receive(String str){
        System.out.println(str);
    }
}
