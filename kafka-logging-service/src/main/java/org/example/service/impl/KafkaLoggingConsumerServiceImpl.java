package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.service.KafkaConsumerService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaLoggingConsumerServiceImpl implements KafkaConsumerService {

    @KafkaListener(topics = "new_orders")
    @Override
    public void consumeEvent(String message) {
        System.out.println("Log new orders: " + message);
    }

    @KafkaListener(topics = "payed_orders")
    public void consumeEventPayedOrders(String message) {
        System.out.println("Log new payed orders: " + message);
    }

    @KafkaListener(topics = "sent_orders")
    public void consumeEventSentOrders(String message) {
        System.out.println("Log new send orders: " + message);
    }
}
