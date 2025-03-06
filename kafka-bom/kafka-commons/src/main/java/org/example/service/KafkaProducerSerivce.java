package org.example.service;

public interface KafkaProducerSerivce {

    void sendPaymentProcessedEvent(String message);
}
