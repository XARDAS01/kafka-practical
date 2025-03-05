package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.api.dto.MessageObject;
import org.example.service.KafkaConsumerService;
import org.example.service.KafkaProducerSerivce;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaPaymentConsumerServiceImpl implements KafkaConsumerService {

    private final KafkaProducerSerivce kafkaProducerSerivce;

    @KafkaListener(topics = "payed_orders")
    @Override
    public void consumeProcessedEvent(String message) {
        kafkaProducerSerivce.sendPaymentProcessedEvent(message);
        System.out.println("Order shipping process");
    }
}
