package com.zjz.rabbit;


import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitmqListener {

    @Value("${zjz.name.insert}")
    private String zjzInsert;

    @Bean
    public Queue zjzInsertQueue(){
        return new Queue(zjzInsert);
    }

}
