package com.zoho.attendance.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zoho.attendance.entity.ReqEvent;
import com.zoho.attendance.service.ReqEventService;
@RestController
@RequestMapping(path="/reqevent")
@CrossOrigin("*")
public class ReqEventController {
    @Autowired
	ReqEventService reqEventService;

    @PostMapping(path = "")
    @CrossOrigin
    public ResponseEntity<?> reqEvent(@RequestBody ReqEvent reqEvent) {
    	HttpHeaders headers = new HttpHeaders();
    	
    	    try {
                reqEventService.reqEvent(reqEvent);
    	    		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(reqEvent);
    	    }catch (Exception e) {
				// TODO: handle exception
    	    	headers.add("Message", "false");
    	    	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body("Failed to add the ReqEvent");
			}
    }

    @GetMapping(path = "")
	 @CrossOrigin
	    public ResponseEntity<?> getEventReq() {
		 HttpHeaders headers = new HttpHeaders();
	        
	        try {   	
	    		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(reqEventService.getEventReq());
	    }catch (Exception e) {
	    	headers.add("Message", "false");
	    	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body("Failed to get the ReqEvent");
		}
		 		
	    }

    @PutMapping(path = "/{id}")
    @CrossOrigin
    public ResponseEntity<?> updateEventReq(@PathVariable Long id, @RequestBody ReqEvent reqEvent) {
HttpHeaders headers = new HttpHeaders();
    	
	    try {  
	    		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(reqEventService.updateEventReq(id,reqEvent));
	    }catch (Exception e) {
	    	headers.add("Message", "false");
	    	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body("Failed to update the ReqEvent");
		}
       
    }
}
