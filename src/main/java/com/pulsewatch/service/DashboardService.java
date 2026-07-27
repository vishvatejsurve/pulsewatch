package com.pulsewatch.service;

import com.pulsewatch.dto.CountDTO;
import com.pulsewatch.dto.DashboardResponseDTO;
import com.pulsewatch.dto.DashboardSummaryDTO;

import java.util.List;

public interface DashboardService {
    DashboardSummaryDTO getSummary();

    List<CountDTO> getEventsByType();

    List<CountDTO> getEventsByStatus();

    DashboardResponseDTO getDashboard();

}
