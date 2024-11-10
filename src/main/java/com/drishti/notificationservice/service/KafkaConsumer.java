package com.drishti.notificationservice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "my-first-topic", groupId = "group_id")
    public void listen(String message) {
        System.out.println("Received Message: " + message);
    }
}
