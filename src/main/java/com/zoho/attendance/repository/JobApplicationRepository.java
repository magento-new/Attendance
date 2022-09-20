package com.zoho.attendance.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zoho.attendance.entity.JobApplication;
@Repository
public interface JobApplicationRepository extends CrudRepository<JobApplication, Long> {
   
	JobApplication findById(int jobId);

    @Transactional
    void deleteById(int jobId);

}	