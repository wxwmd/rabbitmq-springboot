package com.example.rabbitmqfanoutdemo.config;

import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Binding;

@Configuration
public class SendConfiguration {
    @Bean(name = "queue01")
    public Queue getQueue01(){
        return new Queue("queue");
    }

    @Bean(name = "queue02")
    public Queue getQueue02(){
        return new Queue("queue1");
    }

    @Bean()
    public FanoutExchange getChange(){
        return new FanoutExchange("amq.fanout");
    }

    @Bean
    public Binding binding01(@Qualifier("queue01") Queue queue01,FanoutExchange fanoutExchange){
        return BindingBuilder.bind(queue01).to(fanoutExchange);
    }

    @Bean
    public Binding binding02(@Qualifier("queue02") Queue queue02,FanoutExchange fanoutExchange){
        return BindingBuilder.bind(queue02).to(fanoutExchange);
    }
}
