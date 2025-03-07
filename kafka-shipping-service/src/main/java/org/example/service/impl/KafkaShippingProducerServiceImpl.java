package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.service.KafkaProducerSerivce;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaShippingProducerServiceImpl implements KafkaProducerSerivce {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void sendEvent(String message) {
        kafkaTemplate.send("sent_orders", message);
        System.out.println("Order sent");
    }
}
