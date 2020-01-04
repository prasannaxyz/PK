package org.PK.Spring.Rest.Services.Get.main;

import java.util.List;

import org.PK.Spring.Rest.Services.Get.config.WebConfig;
import org.PK.Spring.Rest.Services.Get.dao.EmployeeDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pk.common.config.DBConfig;
import com.pk.common.vo.Employee;


public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);

		EmployeeDao employeeDao = context.getBean(EmployeeDao.class);

		// Get employees
		List<Employee> employees = employeeDao.listUsers();
		for (Employee employee : employees) {
			System.out.println("Id = " + employee.getId());
			System.out.println("First Name = " + employee.getFirstName());
			System.out.println("Last Name = " + employee.getLastName());
			System.out.println();
		}

		context.close();
	}
}