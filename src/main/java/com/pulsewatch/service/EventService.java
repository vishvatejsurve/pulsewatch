package com.pulsewatch.service;

import com.pulsewatch.dto.DashboardResponseDTO;
import com.pulsewatch.dto.EventRequestDTO;
import com.pulsewatch.dto.EventResponseDTO;

import java.util.List;

public interface EventService {
    EventResponseDTO createEvent(EventRequestDTO requestDTO);

    List<EventResponseDTO> getAllEvents();
    EventResponseDTO getEventById(Long id);

    DashboardResponseDTO getDashboard();
}
