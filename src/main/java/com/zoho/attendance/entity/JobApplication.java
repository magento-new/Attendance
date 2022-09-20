package com.zoho.attendance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "jobApplication")
public class JobApplication {

	@Id
	@Column(name = "jobId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	@Column(name = "aboutcompany")
	String aboutcompany;
	@Column(name = "description")
	String description;
	@Column(name = "skills")
	String skills;
	@Column(name = "experience")
	String experience;
	@Column(name = "notice")
	String notice;
	@Column(name = "serving")
	String serving;
	@Column(name = "currentctc")
	String currentctc;
	@Column(name = "expectedctc")
	String expectedctc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAboutcompany() {
		return aboutcompany;
	}

	public void setAboutcompany(String aboutcompany) {
		this.aboutcompany = aboutcompany;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public String getServing() {
		return serving;
	}

	public void setServing(String serving) {
		this.serving = serving;
	}

	public String getCurrentctc() {
		return currentctc;
	}

	public void setCurrentctc(String currentctc) {
		this.currentctc = currentctc;
	}

	public String getExpectedctc() {
		return expectedctc;
	}

	public void setExpectedctc(String expectedctc) {
		this.expectedctc = expectedctc;
	}

	public JobApplication(int id, String aboutcompany, String description, String skills, String experience,
			String notice, String serving, String currentctc, String expectedctc) {
		super();
		this.id = id;
		this.aboutcompany = aboutcompany;
		this.description = description;
		this.skills = skills;
		this.experience = experience;
		this.notice = notice;
		this.serving = serving;
		this.currentctc = currentctc;
		this.expectedctc = expectedctc;
	}

	public JobApplication() {

	}

}
