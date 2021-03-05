package com.zjz.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class SendMqMessage {

    public static AmqpTemplate amqpTemplate;

    private String queueName;

    @Autowired
    public void setAmqpTemplate(AmqpTemplate amqpTemplate){
        SendMqMessage.amqpTemplate = amqpTemplate;
    }

    public void setQueueName(String queueName){
        this.queueName = queueName;
    }

    public static void exe(Map<String, Object> o){
//        amqpTemplate.convertAndSend();
    }
}
