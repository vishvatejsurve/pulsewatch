package com.pulsewatch.controller;

import com.pulsewatch.dto.DashboardResponseDTO;
import com.pulsewatch.dto.EventRequestDTO;
import com.pulsewatch.dto.EventResponseDTO;
import com.pulsewatch.service.EventService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/events")
public class EventController {
    private final EventService eventService;

    @PostMapping
    public ResponseEntity<EventResponseDTO> createEvent(@RequestBody @Valid EventRequestDTO requestDTO){

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(eventService.createEvent(requestDTO));
    }
    @GetMapping
    public ResponseEntity<List<EventResponseDTO>> getAllEvents()
    {
        return ResponseEntity.ok(eventService.getAllEvents());
    }
    @GetMapping("/{id}")
    public ResponseEntity<EventResponseDTO> getEventById(@PathVariable Long id)
    {
        return ResponseEntity.ok(eventService.getEventById(id));
    }
    @GetMapping("/dashboard")
    public ResponseEntity<DashboardResponseDTO> getDashboard()
    {
        return ResponseEntity.ok(eventService.getDashboard());
    }
}
