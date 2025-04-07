package com.example.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic pedidoTopic() {
        return new NewTopic("pedido-topic", 1, (short) 1);
    }

    @Bean
    public NewTopic boletaTopic() {
        return new NewTopic("boleta-topic", 1, (short) 1);
    }
}
