package com.example.kafka;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.example.model.Pedido;
import com.example.model.Boleta;

@Service
public class KafkaProducerService {

    @Value("${kafka.topic.pedido}")
    private String pedidoTopic;

    @Value("${kafka.topic.boleta}")
    private String boletaTopic;

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void enviarPedido(Pedido pedido) {
        try {
            System.out.println("Enviando pedido a Kafka: " + pedido.getNro());
            kafkaTemplate.send(pedidoTopic, pedido);
        } catch (Exception e) {
            System.err.println("Error enviando a Kafka: " + e.getMessage());
        }
    }

    public void enviarBoleta(Boleta boleta) {
        System.out.println("➡️ Enviando boleta a Kafka: " + boleta.getNumero());
        kafkaTemplate.send(boletaTopic, boleta);
    }
}
