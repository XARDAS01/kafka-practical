package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.api.dto.MessageObject;
import org.example.service.KafkaConsumerService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaNotificationConsumerServiceImpl implements KafkaConsumerService {

    @KafkaListener(topics = "sent_orders")
    @Override
    public void consumeProcessedEvent(String message) {
        System.out.println("Notification about order: " + message);
    }
}
