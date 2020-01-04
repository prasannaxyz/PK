
package org.PK.Spring.Rest.Services.Get.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.PK.Spring.Rest.Services.Get.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pk.common.vo.Employee;

@RestController
public class GetEmployeeApi {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value = "/getEmployee", produces = APPLICATION_JSON_VALUE)
	public List<Employee> getTrainProfiles(final HttpServletRequest request, final HttpServletResponse response) {
		return employeeService.listUsers();
	}

}