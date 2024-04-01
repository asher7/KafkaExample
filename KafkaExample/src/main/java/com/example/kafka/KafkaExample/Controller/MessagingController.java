package com.example.kafka.KafkaExample.Controller;

import com.example.kafka.KafkaExample.DTO.UserDetails;
import com.example.kafka.KafkaExample.Kafka.JsnoKafkaProducer;
import com.example.kafka.KafkaExample.Kafka.KafkaProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class MessagingController {

    @Autowired
    private KafkaProducer kafkaProducer;
    @Autowired
    private JsnoKafkaProducer jsnoKafkaProducer;

    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message) {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("message published");
    }

    @PostMapping("/data")
    public ResponseEntity<String> serializerExample(@RequestBody UserDetails user) {

        jsnoKafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json data published");
    }
}
