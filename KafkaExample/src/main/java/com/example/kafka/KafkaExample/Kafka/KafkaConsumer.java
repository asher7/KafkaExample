package com.example.kafka.KafkaExample.Kafka;

import org.apache.kafka.common.internals.Topic;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "rj",groupId = "my-group")
    public void consume( String msg)
    {
        System.err.println(msg);
    }
}
