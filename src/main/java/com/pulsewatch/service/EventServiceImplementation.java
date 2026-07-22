package com.pulsewatch.service;

import com.pulsewatch.dto.EventRequestDTO;
import com.pulsewatch.dto.EventResponseDTO;
import com.pulsewatch.entity.Event;
import com.pulsewatch.mapper.EventMapper;
import com.pulsewatch.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class EventServiceImplementation implements EventService {
    private final EventRepository repository;
    private final EventMapper eventMapper;

    @Override
    public EventResponseDTO createEvent(EventRequestDTO requestDTO) {
        Event event = eventMapper.toEntity(requestDTO);

        Event savedEvent = repository.save(event);

        return eventMapper.toResponseDTO(savedEvent);
    }
}
