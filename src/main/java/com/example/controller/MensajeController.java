package com.example.controller;
import com.example.kafka.KafkaProducerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.model.Pedido;
import com.example.model.Boleta;

@RestController
@RequestMapping("/")
public class MensajeController {

    private final KafkaProducerService kafkaService;

    public MensajeController(KafkaProducerService kafkaService) {
        this.kafkaService = kafkaService;
    }

    @PostMapping("/pedido")
    public ResponseEntity<String> enviarPedido(@RequestBody Pedido pedido) {
        kafkaService.enviarPedido(pedido);
        return ResponseEntity.ok("Pedido enviado.");
    }

    @PostMapping("/boleta")
    public ResponseEntity<String> enviarBoleta(@RequestBody Boleta boleta) {
        kafkaService.enviarBoleta(boleta);
        return ResponseEntity.ok("Boleta enviada.");
    }
}
