package com.pulsewatch.service;

import com.pulsewatch.dto.EventRequestDTO;
import com.pulsewatch.dto.EventResponseDTO;

public interface EventService {
    EventResponseDTO createEvent(EventRequestDTO requestDTO);
}
