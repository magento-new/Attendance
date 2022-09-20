package com.zoho.attendance.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "event")
public class Event {
    @Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "scheduleTime")
	private String scheduleTime;
	@Column(name = "eventName")
	private String eventName;
	@Column(name = "selectionType")
	private String selectionType;
    
    public Event() {
    }
    
    public Event(Long id, String scheduleTime, String eventName, String selectionType) {
        this.id = id;
        this.scheduleTime = scheduleTime;
        this.eventName = eventName;
        this.selectionType = selectionType;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getScheduleTime() {
        return scheduleTime;
    }
    public void setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }
    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public String getSelectionType() {
        return selectionType;
    }
    public void setSelectionType(String selectionType) {
        this.selectionType = selectionType;
    }
    
}
