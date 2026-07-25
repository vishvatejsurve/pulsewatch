package com.pulsewatch.controller;

import com.pulsewatch.dto.CountDTO;
import com.pulsewatch.dto.DashboardSummaryDTO;
import com.pulsewatch.service.DashboardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/dashboard")
public class DashboardController {

    private final DashboardService dashboardService;

    @GetMapping("/summary")
    public DashboardSummaryDTO summaryDTO()
    {
        return dashboardService.getSummary();
    }

    @GetMapping("/types")
    public List<CountDTO> types() {
        return dashboardService.getEventsByType();
    }

    @GetMapping("/status")
    public List<CountDTO> status() {
        return dashboardService.getEventsByStatus();
    }

}
