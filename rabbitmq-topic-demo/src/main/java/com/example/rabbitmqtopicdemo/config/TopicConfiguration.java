package com.example.rabbitmqtopicdemo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicConfiguration {
    @Bean(name = "queue01")
    Queue getQueue01(){
        return new Queue("queue");
    }

    @Bean(name = "queue02")
    Queue gwtQueue02(){
        return new Queue("queue1");
    }

    @Bean
    TopicExchange getExchange(){
        return new TopicExchange("amq.topic");
    }

    @Bean
    Binding getBinding01(@Qualifier("queue01") Queue queue,TopicExchange topicExchange){
        return BindingBuilder.bind(queue).to(topicExchange).with("queue01.#");
    }

    @Bean
    Binding getBinding02(@Qualifier("queue02") Queue queue,TopicExchange topicExchange){
        return BindingBuilder.bind(queue).to(topicExchange).with("queue02.#");
    }
}
