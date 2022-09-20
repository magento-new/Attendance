package com.zoho.attendance.repository;


import java.util.Date;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.hibernate.boot.model.relational.Database;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zoho.attendance.controller.string;
import com.zoho.attendance.entity.AttendanceDetail;

public interface AttendanceRepository extends CrudRepository<AttendanceDetail, Long> {

	AttendanceDetail[] findByEmployeeId(String employeeid);
	
	AttendanceDetail[] findByDepartmentId(int departmentid);
	
	AttendanceDetail findByEmployeeIdAndDepartmentId(String employeeid,int departmentid);
	
	
	Long countByEmployeeIdAndDepartmentId(String employeeid,int departmentid);
	
	Long countByEmployeeIdAndDepartmentIdAndAvailable(String employeeid,int departmentid,String available);
	
	Long countByEmployeeIdAndDepartmentIdAndMonth(String employeeid,int departmentid,Date entry_date);
	
	@Query(value = "SELECT count(*) as total FROM attendancedetail where department_id = ?1 and month = ?2 group by employee_id")
	Long countByDepartmentIdAndMonth(int departmentid,String month);

	Long countByDepartmentIdAndMonthAndAvailable(int departmentid,String month,String available);

	@Transactional
	void deleteByEmployeeIdAndDepartmentId(String employeeid,int departmentid);
	
	@Transactional
	void deleteByDepartmentId(int departmentid);
	
	@Transactional
	void deleteByEmployeeId(String employeeid);
	@Transactional
	
	@Query(value = "SELECT employeeId,count(available) as total FROM attendancedetail where available=1 and department_id = ?1 and month = ?2 and shift = ?3 group by employee_id order by count(available) desc")
	Object[] findByAttencountOrderByAttencountAsc(int departmentid,String month,String shift);

	long countByEmployeeIdAndDepartmentIdAndAvailable(String employeeid, int departmentid, string available);

	AttendanceDetail findById(String month);

	AttendanceDetail findByEmployeeIdAndEntryDate(String employeeid, Date entrydate);


	

}	
