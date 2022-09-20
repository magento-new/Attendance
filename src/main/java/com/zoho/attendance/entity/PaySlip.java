package com.zoho.attendance.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "payslip")
public class PaySlip {
    @Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "personalno")
	private Long personalno;
	@Column(name = "name")
	private String name;
	@Column(name = "bank")
	private String bank;
	@Column(name = "bankaccno")
	private String bankaccno;
	@Column(name = "dob")
	private Date dob;
	@Column(name = "lopdays")
	private Long lopdays;
	@Column(name = "pfno")
	private String pfno;
	@Column(name = "stddays")
	private String stddays;
    @Column(name = "location")
	private String location;
	@Column(name = "workingdays")
	private String workingdays;
	@Column(name = "department")
	private String department;
	@Column(name = "designation")
	private String designation;
	@Column(name = "basic")
	private String basic;
	@Column(name = "pf")
	private Long pf;
	@Column(name = "houserent")
	private Long houserent;
	@Column(name = "tax")
	private Long tax;
    @Column(name = "specialallowance")
	private Long specialallowance;
	@Column(name = "incometax")
	private Long incometax;
    @Column(name = "conveyance")
	private Long conveyance;
	@Column(name = "payslipadd")
	private Long payslipadd;
	@Column(name = "payslipshift")
	private Long payslipshift;
	@Column(name = "bonus")
	private Long bonus;
	@Column(name = "medical")
	private Long medical;
	@Column(name = "grossearn")
	private Long grossearn;
	@Column(name = "grossdeduction")
	private Long grossdeduction;
	@Column(name = "netpay")
	private Long netpay;
    public Long getId() {
        return id;
    }
    public PaySlip(Long id, Long personalno, String name, String bank, String bankaccno, Date dob, Long lopdays,
            String pfno, String stddays, String location, String workingdays, String department, String designation,
            String basic, Long pf, Long houserent, Long tax, Long specialallowance, Long incometax, Long conveyance,
            Long payslipadd, Long payslipshift, Long bonus, Long medical, Long grossearn, Long grossdeduction, Long netpay) {
        this.id = id;
        this.personalno = personalno;
        this.name = name;
        this.bank = bank;
        this.bankaccno = bankaccno;
        this.dob = dob;
        this.lopdays = lopdays;
        this.pfno = pfno;
        this.stddays = stddays;
        this.location = location;
        this.workingdays = workingdays;
        this.department = department;
        this.designation = designation;
        this.basic = basic;
        this.pf = pf;
        this.houserent = houserent;
        this.tax = tax;
        this.specialallowance = specialallowance;
        this.incometax = incometax;
        this.conveyance = conveyance;
        this.payslipadd = payslipadd;
        this.payslipshift = payslipshift;
        this.bonus = bonus;
        this.medical = medical;
        this.grossearn = grossearn;
        this.grossdeduction = grossdeduction;
        this.netpay = netpay;
    }
    public PaySlip() {
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getPersonalno() {
        return personalno;
    }
    public void setPersonalno(Long personalno) {
        this.personalno = personalno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBank() {
        return bank;
    }
    public void setBank(String bank) {
        this.bank = bank;
    }
    public String getBankaccno() {
        return bankaccno;
    }
    public void setBankaccno(String bankaccno) {
        this.bankaccno = bankaccno;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public Long getLopdays() {
        return lopdays;
    }
    public void setLopdays(Long lopdays) {
        this.lopdays = lopdays;
    }
    public String getPfno() {
        return pfno;
    }
    public void setPfno(String pfno) {
        this.pfno = pfno;
    }
    public String getStddays() {
        return stddays;
    }
    public void setStddays(String stddays) {
        this.stddays = stddays;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getWorkingdays() {
        return workingdays;
    }
    public void setWorkingdays(String workingdays) {
        this.workingdays = workingdays;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getBasic() {
        return basic;
    }
    public void setBasic(String basic) {
        this.basic = basic;
    }
    public Long getPf() {
        return pf;
    }
    public void setPf(Long pf) {
        this.pf = pf;
    }
    public Long getHouserent() {
        return houserent;
    }
    public void setHouserent(Long houserent) {
        this.houserent = houserent;
    }
    public Long getTax() {
        return tax;
    }
    public void setTax(Long tax) {
        this.tax = tax;
    }
    public Long getSpecialallowance() {
        return specialallowance;
    }
    public void setSpecialallowance(Long specialallowance) {
        this.specialallowance = specialallowance;
    }
    public Long getIncometax() {
        return incometax;
    }
    public void setIncometax(Long incometax) {
        this.incometax = incometax;
    }
    public Long getConveyance() {
        return conveyance;
    }
    public void setConveyance(Long conveyance) {
        this.conveyance = conveyance;
    }
    public Long getADD() {
        return payslipadd;
    }
    public void setADD(Long payslipadd) {
        this.payslipadd = payslipadd;
    }
    public Long getShift() {
        return payslipshift;
    }
    public void setShift(Long payslipshift) {
        this.payslipshift = payslipshift;
    }
    public Long getBonus() {
        return bonus;
    }
    public void setBonus(Long bonus) {
        this.bonus = bonus;
    }
    public Long getMedical() {
        return medical;
    }
    public void setMedical(Long medical) {
        this.medical = medical;
    }
    public Long getGrossearn() {
        return grossearn;
    }
    public void setGrossearn(Long grossearn) {
        this.grossearn = grossearn;
    }
    public Long getGrossdeduction() {
        return grossdeduction;
    }
    public void setGrossdeduction(Long grossdeduction) {
        this.grossdeduction = grossdeduction;
    }
    public Long getNetpay() {
        return netpay;
    }
    public void setNetpay(Long netpay) {
        this.netpay = netpay;
    }
    
}
