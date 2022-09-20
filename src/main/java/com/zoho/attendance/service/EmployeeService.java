package com.zoho.attendance.service;

import java.util.List;

import com.zoho.attendance.entity.UserAccount;
import com.zoho.attendance.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.zoho.attendance.entity.EmployeeDetail;
import com.zoho.attendance.repository.EmployeeRepository;
import org.springframework.transaction.annotation.Transactional;

@Service("EmployeeService")
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeerepository;
	
	public String updateEmp(int id,EmployeeDetail employeedetail) {
    	EmployeeDetail l = employeerepository.findByEmployeeId(id);
    	if(l!=null) {
            l.setFirstName(employeedetail.getFirstName());
            l.setLastName(employeedetail.getLastName());
			l.setAddress(employeedetail.getAddress());
			l.setEmail(employeedetail.getMailId());
			l.setPhno(employeedetail.getPhno());

            employeerepository.save(l);		
    	}
		return "Employee has been updated, event name = " + l.getUsername();
	}

	@Autowired
	UserAccountRepository userAccountRepository;

	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
     @Transactional
	 public String addUser(EmployeeDetail employeedetail) {
     	System.out.println("PLSS1"+employeedetail.getShift());

		 	EmployeeDetail empdetail = (EmployeeDetail)employeerepository.findByEmployeeId(employeedetail.getEmployeeId());
	        if(empdetail==null) {
	        	System.out.println("PLSS"+employeedetail.getShift());
		 	employeerepository.save(employeedetail);
				UserAccount userAccount = new UserAccount(employeedetail.getUserType(),bCryptPasswordEncoder.encode(employeedetail.getPassword()),String.valueOf(employeedetail.getUsername()));
				userAccountRepository.save(userAccount);
	        return "User account has been added";
	        }
	        return null;
	    }
	 
	    public List<EmployeeDetail> findAllUser() {
	    	List<EmployeeDetail> employeeList = (List<EmployeeDetail>) employeerepository.findAll();

	        if (employeeList != null) {
	        	return employeeList;
	        }
	        return null;
	    }

	    
	    public String findByempdept(int employeeid) {
			 EmployeeDetail employee = (EmployeeDetail) employeerepository.findByEmployeeId(employeeid);

			  if (employee != null) {
		           return employee.getDepartment();
		        }

		        return null;
		  }
	    
	    public EmployeeDetail[] findBydeptemp(String department) {
			 EmployeeDetail[] employee = (EmployeeDetail[]) employeerepository.findByDepartment(department);

			  if (employee != null) {
		           return employee;
		        }

		        return null;
		  }
	    
	    public EmployeeDetail findByempid(String employeeid,String shift) {
		 EmployeeDetail employee = (EmployeeDetail) employeerepository.findByEmployeeIdAndShift(employeeid,shift);

		  if (employee != null) {
	           return employee;
	        }

	        return null;
	  }



	    public String deleteByEmpid(String employeeid) {
	    	employeerepository.deleteByEmployeeId(employeeid);
	        return "User data has been deleted successfully.";

	    }

	    
}
