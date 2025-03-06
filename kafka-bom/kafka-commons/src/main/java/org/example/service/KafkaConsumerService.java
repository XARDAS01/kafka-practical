package org.example.service;

public interface KafkaConsumerService {

    void consumeProcessedEvent(String message);
}
