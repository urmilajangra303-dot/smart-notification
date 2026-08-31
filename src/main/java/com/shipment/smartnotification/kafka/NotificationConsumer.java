package com.shipment.smartnotification.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {

    @KafkaListener(
            topics = "shipment-notifications",
            groupId = "notification-service"
    )
    public void consume(String message) {

        System.out.println("📩 Notification received: " + message);

    }
}