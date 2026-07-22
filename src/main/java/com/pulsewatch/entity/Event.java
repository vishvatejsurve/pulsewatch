package com.pulsewatch.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Event {
    @Id
    @GeneratedValue
    private Long id;
    private EventType eventType;
    private String serviceName;
    private EventStatus status;
    private Integer responseTime;
    private LocalDateTime createdAt;


}
