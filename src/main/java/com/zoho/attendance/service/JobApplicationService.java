package com.zoho.attendance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.attendance.entity.JobApplication;
import com.zoho.attendance.repository.JobApplicationRepository;

@Service("JobApplicationService")
public class JobApplicationService {
	
	@Autowired
	JobApplicationRepository jobrepository;
	

	 public String addUser(JobApplication jobApplication) {

		 JobApplication job = (JobApplication)jobrepository.findById(jobApplication.getId());
	        if(job==null) {
	        	jobrepository.save(jobApplication);
	        return "User account has been added";
	        }
	        return null;
	    }
	 
	    public List<JobApplication> findAllUser() {
	    	List<JobApplication> jobs= (List<JobApplication>) jobrepository.findAll();

	        if (jobs != null) {
	        	return jobs;
	        }
	        return null;
	    }

	    
	    
	    public JobApplication findByid(int id) {
	    	JobApplication jobApplication = (JobApplication) jobrepository.findById(id);

		  if (jobApplication != null) {
	           return jobApplication;
	        }

	        return null;
	  }



	    public String deleteByJobid(int id) {
	    	jobrepository.deleteById(id);
	        return "User data has been deleted successfully.";

	    }

	    
}
