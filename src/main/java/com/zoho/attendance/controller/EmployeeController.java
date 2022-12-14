package com.zoho.attendance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zoho.attendance.entity.EmployeeDetail;
import com.zoho.attendance.service.EmployeeService;

@Controller
@RequestMapping(path="/employeedetail")

public class EmployeeController {
	
	@Autowired 
	EmployeeService employeeservice;
	
	@PutMapping(path = "/createEmployee/{id}")
    @CrossOrigin
	@ResponseBody
    public ResponseEntity<?> updateEmp(@PathVariable int id, @RequestBody EmployeeDetail employeedetail) {
HttpHeaders headers = new HttpHeaders();
    	
	    try {  
	    		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(employeeservice.updateEmp(id,employeedetail));
	    }catch (Exception e) {
	    	headers.add("Message", "false");
	    	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body("Failed to update the employee");
		}
       
    }
	
	@PostMapping(path="/addemployee")
	@CrossOrigin
	@ResponseBody
	 public ResponseEntity<?> addUser(@RequestBody EmployeeDetail employeedetail) {

		HttpHeaders headers = new HttpHeaders();
        
        try {   	
    		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(employeeservice.addUser(employeedetail));
    }catch (Exception e) {
    	headers.add("Message", "false");
    	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body("Failed to add the user");
	}
		 	 
	    }
	 
	@GetMapping(path="/findalluseremployee")
	@ResponseBody
	    public ResponseEntity<?> findAllUser() {

		HttpHeaders headers = new HttpHeaders();
        
        try {   	
    		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(employeeservice.findAllUser());
    }catch (Exception e) {
    	headers.add("Message", "false");
    	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body("Failed to add the user");
	}
	    }

	@GetMapping(path="/findbyempidemployee")
	@CrossOrigin
	@ResponseBody
	    public ResponseEntity<?> findByempid(@RequestParam String employeeid,@RequestParam String shift) {
HttpHeaders headers = new HttpHeaders();
        
        try {   	
        	//System.out.println("en da ipdi "+employeeid+employeeservice.findByempid(employeeid));
    		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(employeeservice.findByempid(employeeid,shift));
    }catch (Exception e) {
    	headers.add("Message", "false");
    	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body("Failed to add the user");
	}
		
	  }

	
	//To get dept name using emp  name
	@GetMapping(path="/findbyempdept")
	@CrossOrigin
	@ResponseBody
	    public ResponseEntity<?> findByempdept(@RequestParam int employeeid) {
HttpHeaders headers = new HttpHeaders();
        
        try {   	
        	//System.out.println("en da ipdi "+employeeid+employeeservice.findByempid(employeeid));
    		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(employeeservice.findByempdept(employeeid));
    }catch (Exception e) {
    	headers.add("Message", "false");
    	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body("Failed to add the user");
	}
		
	  }
	
	@GetMapping(path="/findbydeptemp")
	@CrossOrigin
	@ResponseBody
	    public ResponseEntity<?> findBydeptemp(@RequestParam String department) {
HttpHeaders headers = new HttpHeaders();
        
        try {   	
        	//System.out.println("en da ipdi "+employeeid+employeeservice.findByempid(employeeid));
    		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(employeeservice.findBydeptemp(department));
    }catch (Exception e) {
    	headers.add("Message", "false");
    	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body("Failed to add the user");
	}
		
	  }

	@GetMapping(path="/deletebyempidemployee")
	@CrossOrigin
	@ResponseBody
	    public ResponseEntity<?> deleteByEmpid(@RequestParam String employeeid) {
HttpHeaders headers = new HttpHeaders();
        
        try {   	
    		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(employeeservice.deleteByEmpid(employeeid));
    }catch (Exception e) {
    	headers.add("Message", "false");
    	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body("Failed to add the user");
	}
	    	

	    }

}
