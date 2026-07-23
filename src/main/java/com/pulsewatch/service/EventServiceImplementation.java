package com.pulsewatch.service;

import com.pulsewatch.dto.DashboardResponseDTO;
import com.pulsewatch.dto.EventRequestDTO;
import com.pulsewatch.dto.EventResponseDTO;
import com.pulsewatch.entity.Event;
import com.pulsewatch.entity.EventStatus;
import com.pulsewatch.exception.EventNotFoundException;
import com.pulsewatch.mapper.EventMapper;
import com.pulsewatch.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Slf4j
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

    @Override
    public List<EventResponseDTO> getAllEvents() {
        return repository.findAll()
                .stream()
                .map(eventMapper::toResponseDTO)
                .toList();
    }

    @Override
    public EventResponseDTO getEventById(Long id) {
        Event fetchedEvent = repository.findById(id).orElseThrow(()->new EventNotFoundException(id));
        return eventMapper.toResponseDTO(fetchedEvent);
    }

    @Override
    public DashboardResponseDTO getDashboard() {
        DashboardResponseDTO dashboard=new DashboardResponseDTO();
        dashboard.setTotalEvents(repository.count());
        dashboard.setSuccessEvents(repository.countByStatus(EventStatus.SUCCESS));
        dashboard.setFailedEvents(repository.countByStatus(EventStatus.FAILED));
        dashboard.setAverageResponseTime(repository.getAverageResponseTime());

        return  dashboard;
    }
}
