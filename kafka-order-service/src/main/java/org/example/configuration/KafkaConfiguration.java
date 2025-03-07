package org.example.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfiguration {

    @Bean
    public NewTopic topicNewOrders() {
        return TopicBuilder.name("new_orders")
                .partitions(3)
                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic topicPayedOrders() {
        return TopicBuilder.name("payed_orders")
                .partitions(3)
                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic topicSentOrders() {
        return TopicBuilder.name("sent_orders")
                .partitions(3)
                .replicas(1)
                .build();
    }
}