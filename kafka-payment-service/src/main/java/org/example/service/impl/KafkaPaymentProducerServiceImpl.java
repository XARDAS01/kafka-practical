package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.service.KafkaProducerSerivce;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaPaymentProducerServiceImpl implements KafkaProducerSerivce {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void sendPaymentProcessedEvent(String message) {
        kafkaTemplate.send("payed_orders", message);
        System.out.println("Order payed");
    }
}