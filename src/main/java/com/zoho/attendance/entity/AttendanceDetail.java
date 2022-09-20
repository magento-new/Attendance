package com.zoho.attendance.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "attendancedetail")
public class AttendanceDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "employeeId")
    private String employeeId;

    @Column(name = "month")
    private String month;

    @Column(name = "departmentId")
    private int departmentId;
    @Column(name = "available")
    private String available;
    @Column(name = "checkin")
    private String checkin;
    @Column(name = "checkout")
    private String checkout;
    @Column(name = "attencount")
    private Long attencount;
    @Column(name = "entryDate")
    private Date entryDate;


    String shift;


    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }


    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public void setAttencount(Long attencount) {
        this.attencount = attencount;
    }


    public AttendanceDetail(Long id, String employeeId, String month, Date entry_date, int departmentId, String available, String checkin, String checkout, Long attencount, String shift) {
        this.id = id;
        this.employeeId = employeeId;
        this.month = month;
        this.entryDate = entry_date;
        this.departmentId = departmentId;
        this.available = available;
        this.checkin = checkin;
        this.checkout = checkout;
        this.attencount = attencount;
        this.shift = shift;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public long getAttencount() {
        return attencount;
    }

    public void setAttencount(long attencount) {
        this.attencount = attencount;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}