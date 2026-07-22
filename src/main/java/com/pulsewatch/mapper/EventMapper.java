package com.pulsewatch.mapper;

import com.pulsewatch.dto.EventRequestDTO;
import com.pulsewatch.dto.EventResponseDTO;
import com.pulsewatch.entity.Event;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EventMapper {
    Event toEntity(EventRequestDTO dto);
    EventResponseDTO toResponseDTO(Event event);
}
