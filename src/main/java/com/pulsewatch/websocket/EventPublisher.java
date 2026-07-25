package com.pulsewatch.websocket;

import com.pulsewatch.dto.EventResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EventPublisher {

    private final SimpMessagingTemplate messagingTemplate;
    public void publish(EventResponseDTO eventResponseDTO){
        messagingTemplate.convertAndSend("/topic/events", eventResponseDTO);

    }

}
