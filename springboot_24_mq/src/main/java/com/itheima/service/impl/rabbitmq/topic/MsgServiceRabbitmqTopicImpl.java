package com.itheima.service.impl.rabbitmq.topic;

import com.itheima.service.MsgService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MsgServiceRabbitmqTopicImpl implements MsgService {
    @Autowired
    private AmqpTemplate amqpTemplate;

    @Override
    public void sendMsg(String id) {
        System.out.println("待发送短信的订单已纳入处理队列(rabbitmq topic)，id" + id);
        amqpTemplate.convertAndSend("topicExchange","topic.abc.id",id);
    }

    @Override
    public String doMsg() {
        return null;
    }
}
