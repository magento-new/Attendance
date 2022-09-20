package com.zoho.attendance.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.zoho.attendance.entity.EventScheduler;
import com.zoho.attendance.service.EventSchedulerService;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "/scheduler")
public class SchedulerController {

	org.jboss.logging.Logger logger = LoggerFactory.logger(SchedulerController.class);

	@Autowired
    EventSchedulerService eventSchedulerService;

	@GetMapping
	public ResponseEntity<List<EventScheduler>> getAllEvents() {
		List<EventScheduler> events = new ArrayList<EventScheduler>();
		try {
			events = eventSchedulerService.getEvents();
			logger.info("fetched events");
		} catch (Exception e) {
			logger.error(e);
		}
		if (Objects.nonNull(events)) {
			return new ResponseEntity<List<EventScheduler>>(events,HttpStatus.OK);
		} else {
			return new ResponseEntity<List<EventScheduler>>( events , HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping("/save")
	public ResponseEntity<EventScheduler> saveDetails(@RequestBody EventScheduler eventScheduler) {
		if (Objects.nonNull(eventScheduler)) {

			try {
				eventSchedulerService.saveEventData(eventScheduler);

				logger.info("SchedulerEvent data saved");
				eventSchedulerService.sendEmail(eventScheduler);

			}

			catch (Exception e) {
				logger.error(e);
			}

			return new ResponseEntity<EventScheduler>(HttpStatus.OK);
		} else {
			return new ResponseEntity<EventScheduler>(HttpStatus.BAD_REQUEST);
		}
	}



}
