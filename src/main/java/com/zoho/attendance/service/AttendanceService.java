package com.zoho.attendance.service;

import java.util.Date;
import java.util.List;

import org.hibernate.boot.model.relational.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.attendance.controller.string;
import com.zoho.attendance.entity.AttendanceDetail;
import com.zoho.attendance.repository.AttendanceRepository;
import com.zoho.attendance.repository.DepartmentRepository;
import java.util.Date;
@Service("attendanceservice")
public class AttendanceService {

	@Autowired
	 AttendanceRepository attendancerepository;


	public String addUser(AttendanceDetail attendancedetail) {
    	
    		attendancerepository.save(attendancedetail);
	        return "User account has been added, Employee ID = " + attendancedetail.getEmployeeId();
	     

	    }
	 
	    public List<AttendanceDetail> findAllUser() {
	        List<AttendanceDetail> attendanceList = (List<AttendanceDetail>) attendancerepository.findAll();

	        if (attendanceList != null) {
	        	return attendanceList;
	        }
	        return null;
	    }

	    public AttendanceDetail[] findByempid(String employeeid) {
		AttendanceDetail[] attendanceList =  attendancerepository.findByEmployeeId(employeeid);

	        if (attendanceList != null) {
	            return attendanceList;
	        }
	        return null;
	  }
	    
	    
	    public long countByEmployeeIdAndDepartmentId(String employeeid,int departmentid) {
			long attendanceList =  attendancerepository.countByEmployeeIdAndDepartmentId(employeeid,departmentid);
		            return attendanceList;
		        
		  }
	    
	    public long countByDepartmentIdAndMonthAndAvailable(int departmentid,String month,String available) {
			long attendanceList =  attendancerepository.countByDepartmentIdAndMonthAndAvailable(departmentid,month,available);
		            return attendanceList;
		        
		  }
	    public long countByDepartmentIdAndMonth(int departmentid,String month) {
			long attendanceList =  attendancerepository.countByDepartmentIdAndMonth(departmentid,month);
		            return attendanceList;
		        
		  }
	    public long countByEmployeeIdAndDepartmentIdAndMonth(String employeeid,int departmentid,Date entry_date) {
			long attendanceList =  attendancerepository.countByEmployeeIdAndDepartmentIdAndMonth(employeeid,departmentid,entry_date);
		            return attendanceList;
		        
		  }
	    
	    public long countByEmployeeIdAndDepartmentIdAndAvailable(String employeeid,int departmentid,string available) {
			long attendanceList =  attendancerepository.countByEmployeeIdAndDepartmentIdAndAvailable(employeeid,departmentid,available);
		            return attendanceList;
		        
		  }
	    
	    public AttendanceDetail findBydate(String month) {
			AttendanceDetail attendanceList = (AttendanceDetail) attendancerepository.findById(month);

		        if (attendanceList != null) {
		            return attendanceList;
		        }
		        return null;
		  }
	    
	    public AttendanceDetail[] findBydeptid(int departmentid) {
		   AttendanceDetail[] attendanceList = (AttendanceDetail[]) attendancerepository.findByDepartmentId(departmentid);
	        if (attendanceList != null) {
	        		return attendanceList;
	        }
	        return null;
	  }

	    public AttendanceDetail findByName(String employeeid,int departmentid) {
		 AttendanceDetail attendanceList = (AttendanceDetail) attendancerepository.findByEmployeeIdAndDepartmentId(employeeid, departmentid);

	        if (attendanceList != null) {
	           return attendanceList;
	        }

	        return null;
	  }

	    
	    
	    
	    
	    

	    public Object[] sortdeptview(int departmentId,String month,String shift) {
//						AttendanceDetail[] attendanceList = (AttendanceDetail[]) 
//								attendancerepository.findByDepartmentId(departmentid);
//		
//			for(AttendanceDetail atten : attendanceList) {
//				atten.setAttencount(countByDepartmentIdAndMonth(departmentid,month));
//			}
			return attendancerepository.findByAttencountOrderByAttencountAsc(departmentId,month,shift);
	    
	    }
	    
	    
	    
	    
	    
	    
	    
	    public String updateUser(String employeeid,String available,Date entryDate) {
	    	AttendanceDetail attendanceList = (AttendanceDetail) attendancerepository.findByEmployeeIdAndEntryDate(employeeid,entryDate);
	    	if (attendanceList != null) {
	        	
	        	attendanceList.setAvailable(available);
	        	attendancerepository.save(attendanceList);
	        	return "User updated Successfully";
	        }
	        return "User update Failed";
	    }


	    public String deleteByEmpid(String employeeid) {
	    	attendancerepository.deleteByEmployeeId(employeeid);
	        return "Record deleted successfully";
	    }

	    public String deleteBydeptid(int departmentid) {
	    	attendancerepository.deleteByDepartmentId(departmentid);
	       return "Record deleted successfully";
	    }
	   
	    
	    public String deleteByUserNameAndPassword(String employeeid,int departmentid) {
	    	attendancerepository.deleteByEmployeeIdAndDepartmentId(employeeid,departmentid);
	    	return "Record deleted successfully";
	    }


}
