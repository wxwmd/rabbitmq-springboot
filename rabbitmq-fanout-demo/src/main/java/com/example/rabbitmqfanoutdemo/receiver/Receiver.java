package com.example.rabbitmqfanoutdemo.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    @RabbitListener(queues = "queue")
    public void receiver01(String str){
        System.out.println(str);
    }

    @RabbitListener(queues = "queue1")
    public void receiver02(String str){
        System.out.println(str);
    }
}
