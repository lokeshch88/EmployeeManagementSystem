package com.emp;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable {
	private String empId;
	private String fName,lName;
	private DeptType dept;
	private LocalDate joinDate;
	private double salary;
	
	public Employee(String empId, String fName, String lName, DeptType dept, LocalDate joinDate, double salary) {
		super();
		this.empId = empId;
		this.fName = fName;
		this.lName = lName;
		this.dept = dept;
		this.joinDate = joinDate;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fName=" + fName + ", lName=" + lName + ", dept=" + dept + ", joinDate="
				+ joinDate + ", salary=" + salary + "]";
	}
	public String getEmpId() {
		return empId;
	}
	public DeptType getDept() {
		return dept;
	}
	
	
	
	
	
	
	
	
	
	

}
