package com.zoho.attendance.entity;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "reqevent")
public class ReqEvent {
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
	@Column(name = "reqStatus")
	private String reqStatus;
	@Column(name = "reqBy")
    private String reqBy;
    
    public ReqEvent() {
    }
    
    public ReqEvent(Long id, String scheduleTime, String eventName, String selectionType, String reqStatus,
            String reqBy) {
        this.id = id;
        this.scheduleTime = scheduleTime;
        this.eventName = eventName;
        this.selectionType = selectionType;
        this.reqStatus = reqStatus;
        this.reqBy = reqBy;
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
    public String getReqStatus() {
        return reqStatus;
    }
    public void setReqStatus(String reqStatus) {
        this.reqStatus = reqStatus;
    }
    public String getReqBy() {
        return reqBy;
    }
    public void setReqBy(String reqBy) {
        this.reqBy = reqBy;
    }
    
}
