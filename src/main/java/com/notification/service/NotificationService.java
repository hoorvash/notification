package com.notification.service;

import com.notification.model.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class NotificationService {

    private final SimpMessagingTemplate messagingTemplate;

    @Autowired
    public NotificationService(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    public void sendNotification(String message, String type, String recipient) {
        Notification notification = new Notification(
            UUID.randomUUID().toString(),
            message,
            type,
            LocalDateTime.now(),
            recipient
        );
        
        messagingTemplate.convertAndSend("/topic/notifications/" + recipient, notification);
    }

    public void broadcastNotification(String message, String type) {
        Notification notification = new Notification(
            UUID.randomUUID().toString(),
            message,
            type,
            LocalDateTime.now(),
            "all"
        );
        
        messagingTemplate.convertAndSend("/topic/notifications/broadcast", notification);
    }
}