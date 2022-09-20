package com.zoho.attendance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "employeedetail")
public class EmployeeDetail {

	@Id
	@Column(name = "employeeId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int employeeId;

	@Column(name = "dob")
	long dob;

	@Column(name = "gender")
	String gender;

	@Column(name = "bloodgroup")
	String bloodGroup;

	@Column(name = "phno")
	long phno;

	@Column(name = "address")
	String address;

	@Column(name = "department")
	String department;

	@Column(name = "mailid")
	String mailId;

	@Column(name = "firstname")
	String firstName;

	@Column(name = "lastname")
	String lastName;

	@Column(name = "doj")
	long doj;

	@Column(name = "salary")
	long salary;

	@Column(name = "email")
	String email;

	@Column(name = "password")
	String password;

	@Column(name = "degn")
	String degn;

	@Column(name = "username")
	String username;

	@Column(name = "userType")
	String userType;

	String shift;

	public EmployeeDetail() {

	}

	EmployeeDetail(int employeeId, Long dob, String gender, String bloodGroup, Long phno, String address,
			String department, String mailId, String firstName, String lastName, Long doj, Long salary, String email,
			String password, String degn, String username, String userType) {
		this.employeeId = employeeId;
		this.dob = dob;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.phno = phno;
		this.address = address;
		this.department = department;
		this.mailId = mailId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.doj = doj;
		this.salary = salary;
		this.email = email;
		this.password = password;
		this.degn = degn;
		this.username=username;
		this.userType=userType;

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getDegn() {
		return degn;
	}

	public void setDegn(String degn) {
		this.degn = degn;
	}

	public long getDoj() {
		return doj;
	}

	public void setDoj(long doj) {
		this.doj = doj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}


	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public long getDob() {
		return dob;
	}

	public void setDob(long dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getDateOfJoining() {
		return doj;
	}

	public void setDateOfJoining(long dateofjoining) {
		this.doj = dateofjoining;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
}
