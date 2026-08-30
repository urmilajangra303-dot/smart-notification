package com.shipment.smartnotification.repository;

import com.shipment.smartnotification.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository
        extends JpaRepository<Notification, Long> {

}