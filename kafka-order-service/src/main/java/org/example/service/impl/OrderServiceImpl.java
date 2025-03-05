package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.service.OrderService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final KafkaOrderProducerServiceImpl kafkaProducerSerivce;

    @Override
    public String makeOrder() {
        final var order = "order";
        kafkaProducerSerivce.sendPaymentProcessedEvent(order);

        return order;
    }
}
