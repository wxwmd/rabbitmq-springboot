package com.example.rabbitmqtopicdemo.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    @RabbitListener(queues = "queue")
    public void receiver01(String str){
        System.out.println(str + "from queue01");
    }

    @RabbitListener(queues = "queue1")
    public void receiver02(String str){
        System.out.println(str + "from queue02");
    }
}
