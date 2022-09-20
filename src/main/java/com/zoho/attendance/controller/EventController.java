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

import com.zoho.attendance.entity.Event;
import com.zoho.attendance.service.EventService;
@RestController
@RequestMapping(path="/event")
@CrossOrigin("*")
public class EventController {
    @Autowired
	EventService eventService;

    @PostMapping(path = "")
    @CrossOrigin
    public ResponseEntity<?> postEvent(@RequestBody Event event) {
    	HttpHeaders headers = new HttpHeaders();
    	
    	    try {
                eventService.postEvent(event);
    	    		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(event);
    	    }catch (Exception e) {
				// TODO: handle exception
    	    	headers.add("Message", "false");
    	    	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body("Failed to add the event");
			}
    }

    @GetMapping(path = "")
	 @CrossOrigin
	    public ResponseEntity<?> getEvent() {
		 HttpHeaders headers = new HttpHeaders();
	        
	        try {   	
	    		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(eventService.getEvent());
	    }catch (Exception e) {
	    	headers.add("Message", "false");
	    	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body("Failed to get the event");
		}
		 		
	    }

    @PutMapping(path = "/{id}")
    @CrossOrigin
    public ResponseEntity<?> updateEvent(@PathVariable Long id, @RequestBody Event event) {
HttpHeaders headers = new HttpHeaders();
    	
	    try {  
	    		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(eventService.updateEvent(id,event));
	    }catch (Exception e) {
	    	headers.add("Message", "false");
	    	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body("Failed to update the event");
		}
       
    }

    @DeleteMapping(path = "/{id}")
	  @CrossOrigin
	    public String deleteEvent(@PathVariable Long id) {
		  		return eventService.deleteEvent(id);
	    }
}
