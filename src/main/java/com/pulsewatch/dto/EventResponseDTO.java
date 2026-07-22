package com.pulsewatch.dto;

import com.pulsewatch.entity.EventStatus;
import com.pulsewatch.entity.EventType;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventResponseDTO {
    private Long id;
    private EventType eventType;
    private String serviceName;
    private EventStatus status;
    private Integer responseTime;
    private LocalDateTime createdAt;
}
