package org.example.service;

import org.example.api.dto.MessageObject;

public interface KafkaConsumerService {

    void consumeProcessedEvent(String message);
}
