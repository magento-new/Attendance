package com.zoho.attendance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "leavedetail")
public class LeaveDetail {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private Long id;
	
	@Column(name = "employeeId")
	String employeeId;
	

	@Column(name = "employeeName")
	String employeeName;
	

	@Column(name = "leavereason")
	String leavereason;
	
	@Column(name = "deptId")
	String deptId;


	@Column(name = "date")
	String date;

	@Column(name = "fromdate")
	String fromdate;

	

	@Column(name = "todate")
	String todate;

	
	@Column(name = "leavetype")
	String leavetype;
	
	@Column(name = "status")
	String status;
	
	public LeaveDetail() {
		
	}

	public LeaveDetail(Long id, String employeeId, String employeeName, String leavereason, String deptId, String date,
			String fromdate, String todate, String leavetype, String status) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.leavereason = leavereason;
		this.deptId = deptId;
		this.date = date;
		this.fromdate = fromdate;
		this.todate = todate;
		this.leavetype = leavetype;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getLeavereason() {
		return leavereason;
	}

	public void setLeavereason(String leavereason) {
		this.leavereason = leavereason;
	}

	public String getLeavetype() {
		return leavetype;
	}

	public void setLeavetype(String leavetype) {
		this.leavetype = leavetype;
	}
	public String getFromdate() {
		return fromdate;
	}

	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}

	public String getTodate() {
		return todate;
	}

	public void setTodate(String todate) {
		this.todate = todate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

}
