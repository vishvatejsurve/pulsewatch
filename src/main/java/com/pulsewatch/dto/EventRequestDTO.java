package com.pulsewatch.dto;

import com.pulsewatch.entity.EventStatus;
import com.pulsewatch.entity.EventType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventRequestDTO {

    @NotNull
    private EventType eventType;

    @NotBlank
    private String serviceName;

    @NotNull
    private EventStatus status;

    @Positive
    private Integer responseTime;
}
