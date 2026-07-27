package com.pulsewatch.service;

import com.pulsewatch.dto.CountDTO;
import com.pulsewatch.dto.DashboardResponseDTO;
import com.pulsewatch.dto.DashboardSummaryDTO;
import com.pulsewatch.entity.EventStatus;
import com.pulsewatch.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Objects;

@Slf4j
@Service
@RequiredArgsConstructor
public class DashboardServiceImpl implements DashboardService{
    private final EventRepository repository;


    @Override
    @Cacheable("dashboard")
    public DashboardResponseDTO getDashboard() {
        log.info("Fetching dashboard from DATABASE...");
        DashboardResponseDTO dashboard=new DashboardResponseDTO();
        dashboard.setTotalEvents(repository.count());
        dashboard.setSuccessEvents(repository.countByStatus(EventStatus.SUCCESS));
        dashboard.setFailedEvents(repository.countByStatus(EventStatus.FAILED));
        dashboard.setAverageResponseTime(repository.getAverageResponseTime());

        return  dashboard;
    }

    @Override
    public DashboardSummaryDTO getSummary(){

        return DashboardSummaryDTO.builder()
                .totalEvents(repository.count())
                .successEvents(repository.countByStatus(EventStatus.SUCCESS))
                .failedEvents(repository.countByStatus(EventStatus.FAILED))
                .todayEvents(repository.countTodayEvents())
                .build();
    }

    @Override
    public List<CountDTO> getEventsByType() {
        return repository.countByType()
                .stream()
                .map(obj -> new CountDTO(
                        Objects.toString(obj[0],"UNKNOWN"),
                        (Long) obj[1]
                ))
                .toList();
    }

    @Override
    public List<CountDTO> getEventsByStatus() {
        return repository.countByStatus()
                .stream()
                .map(
                        obj -> new CountDTO(
                                obj[0].toString(),
                                (Long) obj[1]
                        )
                )
                .toList();
    }
}
