package com.pulsewatch.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Event {
    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private EventType eventType;

    @Enumerated(EnumType.STRING)
    private String serviceName;
    
    private EventStatus status;
    private Integer responseTime;
    private LocalDateTime createdAt;


}
