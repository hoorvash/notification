package com.notification.controller;

import com.notification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping("/send/{recipient}")
    public ResponseEntity<String> sendNotification(
            @PathVariable String recipient,
            @RequestParam String message,
            @RequestParam(defaultValue = "INFO") String type) {
        
        notificationService.sendNotification(message, type, recipient);
        return ResponseEntity.ok("Notification sent successfully");
    }

    @PostMapping("/broadcast")
    public ResponseEntity<String> broadcastNotification(
            @RequestParam String message,
            @RequestParam(defaultValue = "INFO") String type) {
        
        notificationService.broadcastNotification(message, type);
        return ResponseEntity.ok("Broadcast notification sent successfully");
    }
} 