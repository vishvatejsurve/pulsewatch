package com.pulsewatch.repository;

import com.pulsewatch.entity.Event;
import com.pulsewatch.entity.EventStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EventRepository extends JpaRepository<Event,Long> {
    long count();
    long countByStatus(EventStatus status);
    @Query("""
    SELECT AVG(e.responseTime)
    FROM Event e
    """)
    Double getAverageResponseTime();
}
