package com.zoho.attendance.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EventScheduler {

	private String userName;
	private String eventName;
	private Date date;

	private String fromTime;

	private String toTime;
	private String location;

	private String description;
	@Id
	private String eventLink;

	private String email;







	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEventLink() {
		return eventLink;
	}

	public void setEventLink(String eventLink) {
		this.eventLink = eventLink;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getFromTime() {
		return fromTime;
	}

	public void setFrom(String fromTime) {
		this.fromTime = fromTime;
	}



	public String getToTime() {
		return toTime;
	}

	public void setToTime(String toTime) {
		this.toTime = toTime;
	}

	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}

	@Override
	public String toString() {
		return "EventScheduler [userName=" + userName + ", eventName=" + eventName + ", date=" + date + ", fromTime="
				+ fromTime + ", toTime=" + toTime + ", location=" + location + ", description=" + description
				+ ", eventLink=" + eventLink + ", email=" + email + ", getEmail()=" + getEmail() + ", getEventLink()="
				+ getEventLink() + ", getUserName()=" + getUserName() + ", getEventName()=" + getEventName()
				+ ", getLocation()=" + getLocation() + ", getDescription()=" + getDescription() + ", getDate()="
				+ getDate() + ", getFromTime()=" + getFromTime() + ", getToTime()=" + getToTime() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}




}
