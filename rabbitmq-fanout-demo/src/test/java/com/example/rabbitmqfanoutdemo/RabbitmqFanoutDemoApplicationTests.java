package com.example.rabbitmqfanoutdemo;

import com.example.rabbitmqfanoutdemo.sender.Sender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmqFanoutDemoApplicationTests {

    @Autowired
    private Sender sender;

    @Test
    void contextLoads() {
    }

    @Test
    void send(){
        sender.send("wxw");
    }

}
