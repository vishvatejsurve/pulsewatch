package com.pulsewatch.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DashboardResponseDTO  implements Serializable{

    private static final long serialVersion =1L;
    private Long totalEvents;
    private Long successEvents;
    private Long failedEvents;
    private Double averageResponseTime;
}
