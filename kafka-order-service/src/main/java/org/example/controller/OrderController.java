package org.example.controller;

import org.example.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/v1/api/order")
public record OrderController(OrderService orderService) {

    @PostMapping("/create")
    public ResponseEntity<String> createOrder() {
        return ResponseEntity.ok().body(orderService.makeOrder());
    }
}
