package com.zoho.attendance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zoho.attendance.entity.PaySlip;
import com.zoho.attendance.service.PaySlipService;

@Controller
@RequestMapping(path="/paySlip")
@CrossOrigin("*")
public class PaySlipController {
    @Autowired
	PaySlipService paySlipService;
    
    @PostMapping(path = "")
    @CrossOrigin
    @ResponseBody
    public ResponseEntity<?> postPaySlip(@RequestBody PaySlip paySlip) {
    	HttpHeaders headers = new HttpHeaders();
    	
    	    try {
                paySlipService.postPaySlip(paySlip);
    	    		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(paySlip);
    	    }catch (Exception e) {
				// TODO: handle exception
    	    	headers.add("Message", "false");
    	    	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body("Failed to add the payslip");
			}
    }

    @GetMapping(path = "")
	 @CrossOrigin
	    @ResponseBody
	    public ResponseEntity<?> getPaySlip() {
		 HttpHeaders headers = new HttpHeaders();
	        
	        try {   	
	    		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(paySlipService.getPaySlip());
	    }catch (Exception e) {
	    	headers.add("Message", "false");
	    	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body("Failed to add the payslip");
		}
		 		
	    }
}
