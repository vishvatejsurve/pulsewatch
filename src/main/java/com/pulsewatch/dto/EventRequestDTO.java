package com.pulsewatch.dto;

import com.pulsewatch.entity.EventStatus;
import com.pulsewatch.entity.EventType;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventRequestDTO {

    private EventType eventType;

    private String serviceName;

    private EventStatus status;

    private Integer responseTime;
}
