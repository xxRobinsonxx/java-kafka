package com.example.kafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import com.example.model.Boleta;

@Component
public class KafkaConsumerBoleta {

    @KafkaListener(topics = "${kafka.topic.boleta}", groupId = "boleta-group", containerFactory = "kafkaListenerContainerFactory")
    public void consumir(Boleta boleta) {
        System.out.println("📄 Boleta recibida:");
        System.out.println("Nro: " + boleta.getNumero());
        System.out.println("Total: " + boleta.getTotal());
    }
}
