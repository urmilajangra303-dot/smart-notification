package com.shipment.smartnotification.service;

import com.shipment.smartnotification.entity.Notification;
import com.shipment.smartnotification.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public Notification saveNotification(Notification notification){
        return notificationRepository.save(notification);
    }

}