package com.zoho.attendance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.attendance.entity.LeaveDetail;
import com.zoho.attendance.repository.LeaveRepository;

@Service("LeaveService")
public class LeaveService {

    
    private LeaveRepository LeaveRepository;
	
	@Autowired
    public LeaveService(LeaveRepository leaveRepository) {
        this.LeaveRepository = leaveRepository;   
    }

   
    public String addLeave(LeaveDetail leavedet) {
    	
    		LeaveRepository.save(leavedet);
    		return "Leave has been added, user name = " + leavedet.getEmployeeId();
    	
       
    }
    
    public List<LeaveDetail> findAllUser() {
        List<LeaveDetail> leaveList = (List<LeaveDetail>) LeaveRepository.findAll();
        if (leaveList != null) {
            return leaveList;
        }
        return null;
    }

    public String updateLeave(LeaveDetail leavedet) {
    	
    	LeaveDetail l = LeaveRepository.findByEmployeeIdAndId(leavedet.getEmployeeId(),leavedet.getId());
    	if(l!=null) {
		LeaveRepository.save(l);
		
    	}
		return "Leave has been updated, user name = " + l.getEmployeeId();
	
   
}
    
    public LeaveDetail[] findByEmployeeId(String employeeId) {
        LeaveDetail[] leaveList = LeaveRepository.findByEmployeeId(employeeId);
        if (leaveList != null) {
           return leaveList;
        }
        return null;
    }


    public LeaveDetail[] findByDepartmentId(String deptid) {
    	//System.out.println("HELLO"+deptid);
    	LeaveDetail[] leaveList = LeaveRepository.findByDeptId(deptid);
        if (leaveList != null) {
           return leaveList;
        }
        return null;
    }
    public String deleteByEmpid(String employeeid) {
    	LeaveRepository.deleteByEmployeeId(employeeid);
        return "Leave data has been deleted successfully.";

    }
   
    
}
