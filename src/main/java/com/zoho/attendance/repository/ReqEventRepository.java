package com.zoho.attendance.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zoho.attendance.entity.ReqEvent;

@Repository
public interface ReqEventRepository extends CrudRepository<ReqEvent,Long>{

    ReqEvent findByEventNameAndId(String eventName, Long id);
    
}
