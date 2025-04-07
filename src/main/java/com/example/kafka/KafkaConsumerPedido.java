package com.example.kafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import com.example.model.Pedido;
@Component
public class KafkaConsumerPedido {

    @KafkaListener(topics = "${kafka.topic.pedido}", groupId = "pedido-group", containerFactory = "kafkaListenerContainerFactory")
    public void consumir(Pedido pedido) {
        System.out.println("📦 Pedido recibido:");
        System.out.println("Nro: " + pedido.getNro());
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Dirección: " + pedido.getDireccion());
    }
}
