package com.zoho.attendance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zoho.attendance.entity.PaySlip;

@Repository
public interface PaySlipRepository extends CrudRepository<PaySlip,Long>{
    
}
