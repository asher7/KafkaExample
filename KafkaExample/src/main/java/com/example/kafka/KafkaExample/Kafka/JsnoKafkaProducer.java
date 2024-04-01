package com.example.kafka.KafkaExample.Kafka;

import com.example.kafka.KafkaExample.DTO.UserDetails;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsnoKafkaProducer {



    private final KafkaTemplate<String, UserDetails> kafkaTemplate;

    public JsnoKafkaProducer(KafkaTemplate<String, UserDetails> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(UserDetails user) {
        System.err.println("Message sent: " + user);
        Message<UserDetails> message = MessageBuilder
                .withPayload(user)
                .setHeader(KafkaHeaders.TOPIC, "raj")
                .build();
        kafkaTemplate.send(message);
    }
}
