
package com.zoho.attendance.entity;

import lombok.Builder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;



@Entity(name = "useraccount")
public class UserAccount {


	@Column(name = "type")
	@NotEmpty(message = "*Please provide your id")
    String	type;

	@Column(name = "password")
	@NotEmpty(message = "*Please provide your PASSWORD")
    String password;
	@Id
	@Column(name = "employeeId")
	@NotEmpty(message = "*Please provide your EMPLOYEE ID")
    String employeeId;

	public UserAccount(){

	}
	public UserAccount(String type,String password, String employeeId) {
    	this.type = type;
    	this.password = password;
    	this.employeeId = employeeId;
	}
	
    public String getType() {
        return type;
    }

    public void setType(String username) {
    	this.type = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


}