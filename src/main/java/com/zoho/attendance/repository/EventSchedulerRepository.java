package com.zoho.attendance.repository;

import com.zoho.attendance.entity.EventScheduler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventSchedulerRepository extends JpaRepository<EventScheduler, String>{

}
