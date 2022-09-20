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

import com.zoho.attendance.entity.Expense;
import com.zoho.attendance.service.ExpenseService;

@Controller
@RequestMapping(path="/expense")
@CrossOrigin("*")
public class ExpenseController {

    @Autowired
	ExpenseService expenseService;

    @PostMapping(path = "")
    @CrossOrigin
    @ResponseBody
    public ResponseEntity<?> postExpenses(@RequestBody Expense expense) {
    	HttpHeaders headers = new HttpHeaders();
    	
    	    try {
                expenseService.postExpenses(expense);
    	    		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(expense);
    	    }catch (Exception e) {
				// TODO: handle exception
    	    	headers.add("Message", "false");
    	    	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body("Failed to add the expense");
			}
    }

    @GetMapping(path = "")
	 @CrossOrigin
	    @ResponseBody
	    public ResponseEntity<?> getExpenses() {
		 HttpHeaders headers = new HttpHeaders();
	        
	        try {   	
	    		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(expenseService.getExpenses());
	    }catch (Exception e) {
	    	headers.add("Message", "false");
	    	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body("Failed to add the expense");
		}
		 		
	    }

    @PutMapping(path = "/{id}")
    @CrossOrigin
    @ResponseBody
    public ResponseEntity<?> updateExpenses(@PathVariable Long id, @RequestBody Expense expense) {
HttpHeaders headers = new HttpHeaders();
    	
	    try {  
	    		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(expenseService.updateExpenses(id,expense));
	    }catch (Exception e) {
	    	headers.add("Message", "false");
	    	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body("Failed to update the expense");
		}
       
    }

    @DeleteMapping(path = "/{id}")
	  @CrossOrigin
	    @ResponseBody
	    public String deleteExpenseEntry(@PathVariable Long id) {
		  		return expenseService.deleteExpenseEntry(id);
	    }
    
}
