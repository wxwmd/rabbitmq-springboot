package com.example.rabbitmqtopicdemo;

import com.example.rabbitmqtopicdemo.sender.Sender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmqTopicDemoApplicationTests {
    @Autowired
    private Sender sender;

    @Test
    void contextLoads() {
    }

    @Test
    void RabbitTest(){
        sender.send();
    }
}
