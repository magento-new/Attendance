package com.zoho.attendance.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.attendance.entity.Event;
import com.zoho.attendance.repository.EventRepository;
@Service("EventService")
public class EventService {
    @Autowired
	EventRepository eventRepository;
    public String postEvent(Event event) {

        //Expense expensedetail = expenserepository.findById(expense.getId()).get();
           //if(expensedetail==null) {
            eventRepository.save(event);
           return "Event has been added";
           //}
           //return null;
       }

    public List<Event> getEvent() {        
        List<Event> event = (List<Event>)eventRepository.findAll();
        if (event != null) {
            return event;
        }
        return null;
    }

    public String updateEvent(Long id,Event event) {
    	Event l = eventRepository.findById(event.getId()).get();
    	if(l!=null) {
            l.setScheduleTime(event.getScheduleTime());
            l.setEventName(event.getEventName());

            eventRepository.save(l);		
    	}
		return "Event has been updated, event name = " + l.getEventName();
	}

    public String deleteEvent(Long id) {
    	eventRepository.deleteById(id);
        return "Event data has been deleted successfully.";

    }
}
