package com.pulsewatch.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DashboardSummaryDTO {
    private long totalEvents;

    private long successEvents;

    private long failedEvents;

    private long todayEvents;
}
