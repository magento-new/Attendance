package com.zoho.attendance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="holidaydetail")
public class HolidayDetail {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
		@Column(name = "date")
		long date;
		
		String reason;
		
		public HolidayDetail( Long id,Long date, String reason) {
	    	this.id = id;
	    	this.date = date;
	    	this.reason = reason;
		}
		
		public long getDate() {
			return date;
		}
		public void setDate(long date) {
			
			this.date = date;
		}
		public String getReason() {
			return reason;
		}
		public void setReason(String reason) {
			this.reason = reason;
		}
}
