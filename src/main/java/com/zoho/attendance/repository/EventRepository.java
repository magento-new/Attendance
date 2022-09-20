package com.zoho.attendance.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zoho.attendance.entity.Event;
@Repository
public interface EventRepository extends CrudRepository<Event,Long>{

    Event findByEventNameAndId(String eventName, Long id);
    
}
