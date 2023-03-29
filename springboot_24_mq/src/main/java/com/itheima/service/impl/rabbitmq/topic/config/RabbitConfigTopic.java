package com.itheima.service.impl.rabbitmq.topic.config;



import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfigTopic {

    /*
    消息队列
     */
    @Bean
    public Queue topicQueue(){
        return new Queue("topic_queue");
    }

    /*
   主题交换机
     */
    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange("topicExchange");
    }


    /*
    绑定器
     */
    @Bean
    public Binding bindingTopic(){
        return BindingBuilder.bind(topicQueue()).to(topicExchange()).with("topic.*.id");
    }
}
