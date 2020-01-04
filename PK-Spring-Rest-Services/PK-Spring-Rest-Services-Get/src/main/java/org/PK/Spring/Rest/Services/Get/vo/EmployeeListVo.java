package org.PK.Spring.Rest.Services.Get.vo;

import java.util.List;

import com.pk.common.vo.Employee;

public class EmployeeListVo {
	List<Employee> employees;

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
