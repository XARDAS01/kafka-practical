package org.example.service;

import org.example.api.dto.MessageObject;

public interface KafkaProducerSerivce {

    void sendPaymentProcessedEvent(String message);
}
