package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.service.KafkaConsumerService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaLoggingConsumerServiceImpl implements KafkaConsumerService {

    @KafkaListener(topics = "web_logs")
    @Override
    public void consumeEvent(String message) {
        System.out.println("Log: " + message);
    }
}
