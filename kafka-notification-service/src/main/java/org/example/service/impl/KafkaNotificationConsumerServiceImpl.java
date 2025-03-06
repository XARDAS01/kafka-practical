package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.service.KafkaConsumerService;
import org.example.service.KafkaProducerSerivce;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaNotificationConsumerServiceImpl implements KafkaConsumerService {

    private final KafkaProducerSerivce kafkaProducerSerivce;

    @KafkaListener(topics = "sent_orders")
    @Override
    public void consumeEvent(String message) {
        kafkaProducerSerivce.sendEvent(message);
        System.out.println("Notification about order: " + message);
    }
}
