package com.pulsewatch.controller;

import com.pulsewatch.dto.CountDTO;
import com.pulsewatch.dto.DashboardResponseDTO;
import com.pulsewatch.dto.DashboardSummaryDTO;
import com.pulsewatch.service.DashboardService;
import com.pulsewatch.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/dashboard")
public class DashboardController {

    private final DashboardService dashboardService;

    @GetMapping()
    public ResponseEntity<DashboardResponseDTO> getDashboard()
    {
        return ResponseEntity.ok(dashboardService.getDashboard());
    }

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
