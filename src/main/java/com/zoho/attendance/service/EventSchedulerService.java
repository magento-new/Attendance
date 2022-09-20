package com.zoho.attendance.service;

import java.util.List;

import com.zoho.attendance.repository.EventSchedulerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.zoho.attendance.entity.EventScheduler;

@Service
public class EventSchedulerService {

	private JavaMailSender javaMailSender;
	
	@Autowired
    EventSchedulerRepository eventSchedulerRepository;


	@Autowired
	public void MailService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

	public String saveEventData(EventScheduler eventScheduler){
		eventSchedulerRepository.save(eventScheduler);
		return "sucesss";

	}


	public void sendEmail(EventScheduler eventScheduler) throws MailException {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setFrom("jaanviece@gmail.com");
		mail.setTo(eventScheduler.getEmail());
		mail.setSubject(" Meeting Scheduled!!!");
		mail.setText("Meeting is scheduled at " + eventScheduler.getDate() + eventScheduler.getFromTime() + "To " + eventScheduler.getToTime());
		javaMailSender.send(mail);
	}

	public List<EventScheduler> getEvents() {
		List<EventScheduler>  events=eventSchedulerRepository.findAll();
		return events;
	}
}
