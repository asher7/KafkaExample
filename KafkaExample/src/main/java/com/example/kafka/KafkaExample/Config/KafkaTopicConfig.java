package com.example.kafka.KafkaExample.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic myTopic(){
        return TopicBuilder.name("rj").partitions(5).build();
    }

    @Bean
    public NewTopic anotherTopic() {
        return TopicBuilder.name("raj").partitions(3).replicas(1).build();
    }
}
