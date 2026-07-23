package com.pulsewatch.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DashboardResponseDTO {
    private Long totalEvents;
    private Long successEvents;
    private Long failedEvents;
    private Double averageResponseTime;
}
