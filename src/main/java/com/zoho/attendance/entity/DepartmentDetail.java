package com.zoho.attendance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="departmentdetail")
public class DepartmentDetail {
	@Id
	@Column(name = "departmentid")
	String departmentId;
	
	@Column(name = "departmentName")
	String departmentName;
	
	@Column(name = "noofEmployee")
	Long noOfEmployee;
	
	@Column(name = "managerid")
	String managerId;

	public DepartmentDetail(String departmentId,String departmentName, Long noOfEmployee,String managerId) {
    	this.departmentId = departmentId;
    	this.departmentName = departmentName;
    	this.noOfEmployee = noOfEmployee;
    	this.managerId = managerId;
	}
	
	
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Long getNoOfEmployee() {
		return noOfEmployee;
	}
	public void setNoOfEmployee(Long noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	
}
