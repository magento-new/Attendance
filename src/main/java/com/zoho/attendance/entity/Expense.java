package com.zoho.attendance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity(name = "expense")
public class Expense {
    @Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "empid")
	private Long empid;

	@Column(name = "item")
	private String item;

	@Column(name = "amount")
	private Long amount;

	@Column(name = "category")
	private String category;

    @Column(name = "description")
	private String description;

    @Column(name = "spendOn")
	private Date spendOn;

	@Column(name = "status")
	private String status;
    
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Expense() {
    }

    public Long getEmpid() {
        return empid;
    }

    public void setEmpid(Long empid) {
        this.empid = empid;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getSpendOn() {
        return spendOn;
    }

    public void setSpendOn(Date spendOn) {
        this.spendOn = spendOn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Expense(Long id, Long empid, String item, Long amount, String category, String description, Date spendOn,
            String status) {
        this.id = id;
        this.empid = empid;
        this.item = item;
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.spendOn = spendOn;
        this.status = status;
    }

    
}
