package com.pulsewatch.repository;

import com.pulsewatch.entity.Event;
import com.pulsewatch.entity.EventStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface EventRepository extends JpaRepository<Event,Long> {
    long count();
    long countByStatus(EventStatus status);
    @Query("""
        SELECT AVG(e.responseTime)
        FROM Event e
        """)
    Double getAverageResponseTime();
    @Query("""
        SELECT COUNT(e)
        FROM Event e
        WHERE DATE(e.createdAt)=CURRENT_DATE
        """)
    long countTodayEvents();
    @Query("""
        SELECT e.eventType,COUNT(e)
        FROM Event e
        GROUP BY e.eventType
        """)
    List<Object[]> countByType();
    @Query("""
        SELECT e.status,COUNT(e)
        FROM Event e
        GROUP BY e.status
        """)
    List<Object[]> countByStatus();
}
