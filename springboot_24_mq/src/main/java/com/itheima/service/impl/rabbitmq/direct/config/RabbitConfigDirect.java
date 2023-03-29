package com.itheima.service.impl.rabbitmq.direct.config;



import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class RabbitConfigDirect {

    /*
    消息队列
     */
    @Bean
    public Queue directQueue(){
        return new Queue("direct_queue");
    }

    /*
    直连交换机
     */
    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange("directExchange");
    }


    /*
    绑定器
     */
    @Bean
    public Binding bindingDirect(){
        return BindingBuilder.bind(directQueue()).to(directExchange()).with("direct");
    }
}
