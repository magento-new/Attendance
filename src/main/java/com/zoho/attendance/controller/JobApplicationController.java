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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zoho.attendance.entity.EmployeeDetail;
import com.zoho.attendance.entity.JobApplication;
import com.zoho.attendance.service.JobApplicationService;

@Controller
@RequestMapping(path = "/jobs")
@CrossOrigin("*")
public class JobApplicationController {

	@Autowired
	JobApplicationService jobservice;

	@PostMapping(path = "/applyJob")
	@CrossOrigin
	@ResponseBody
	public ResponseEntity<?> addUser(@RequestBody JobApplication jobDetail) {

		HttpHeaders headers = new HttpHeaders();

		try {
			return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(jobservice.addUser(jobDetail));
		} catch (Exception e) {
			headers.add("Message", "false");
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers)
					.body("Failed to add the Job Profile");
		}

	}

	@GetMapping
	@CrossOrigin
	@ResponseBody
	public ResponseEntity<?> findAllUser() {

		HttpHeaders headers = new HttpHeaders();

		try {
			return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(jobservice.findAllUser());
		} catch (Exception e) {
			headers.add("Message", "false");
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers)
					.body("Failed to Get the Job Profiles");
		}
	}

	@GetMapping(path = "/findByJobId")
	@CrossOrigin
	@ResponseBody
	public ResponseEntity<?> findByempid(@RequestParam int jobId) {
		HttpHeaders headers = new HttpHeaders();

		try {
			return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(jobservice.findByid(jobId));
		} catch (Exception e) {
			headers.add("Message", "false");
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers)
					.body("Failed to add the user");
		}

	}

	@GetMapping(path = "/deletebyjobId")
	@CrossOrigin
	@ResponseBody
	public ResponseEntity<?> deleteByJobId(@RequestParam int jobId) {
		HttpHeaders headers = new HttpHeaders();

		try {
			return ResponseEntity.status(HttpStatus.CREATED).headers(headers)
					.body(jobservice.deleteByJobid(jobId));
		} catch (Exception e) {
			headers.add("Message", "false");
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers)
					.body("Failed to add the user");
		}

	}

}
