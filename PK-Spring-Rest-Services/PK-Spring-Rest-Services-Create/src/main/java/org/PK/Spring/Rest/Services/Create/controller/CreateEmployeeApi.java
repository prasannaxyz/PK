
package org.PK.Spring.Rest.Services.Create.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.PK.Spring.Rest.Services.Create.services.CreateEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pk.common.util.Response;
import com.pk.common.vo.Employee;

@RestController
public class CreateEmployeeApi {
	@Autowired
	private CreateEmployeeService employeeService;

	@PostMapping(value = "/createEmployee", produces = APPLICATION_JSON_VALUE)
	public Response<Employee> createEmployee(final HttpServletRequest request,
			final HttpServletResponse response) {
		employeeService.createUser();
		return new Response<>(null);
	}
}