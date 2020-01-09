package com.pk.locking.lock.aspect.v2_0.vo;

import java.io.Serializable;


public class EmployeeVO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	private Long employeeOid;
	
	private String employeeId;
	
	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	public Long getEmployeeOid() {
		return employeeOid;
	}

	public void setEmployeeOid(Long employeeOid) {
		this.employeeOid = employeeOid;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
