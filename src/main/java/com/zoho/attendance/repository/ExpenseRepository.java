package com.zoho.attendance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zoho.attendance.entity.Expense;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long>{

    Expense findByEmpidAndId(Long empid, Long id);
    
}
