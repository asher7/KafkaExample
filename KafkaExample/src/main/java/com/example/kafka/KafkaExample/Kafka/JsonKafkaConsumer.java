package com.example.kafka.KafkaExample.Kafka;

import com.example.kafka.KafkaExample.DTO.UserDetails;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    @KafkaListener(topics = "raj",groupId = "my-group")
    public void consume( UserDetails msg)
    {
        System.err.println("json data consumed  "+msg.toString());
    }
}
