package com.example.rabbitmqdirectdemo;

import com.example.rabbitmqdirectdemo.reciver.Receiver;
import com.example.rabbitmqdirectdemo.sender.Sender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RabbitTest {

    @Autowired
    private Sender sender;
    @Autowired
    private Receiver receiver;

    @Test
    void rabbitmqTest(){
        sender.send("wxw");
    }
}
