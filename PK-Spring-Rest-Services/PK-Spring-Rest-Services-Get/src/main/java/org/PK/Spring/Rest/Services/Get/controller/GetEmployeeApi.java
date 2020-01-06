
package org.PK.Spring.Rest.Services.Get.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.PK.Spring.Rest.Services.Get.services.EmployeeService;
import org.PK.Spring.Rest.Services.Get.vo.EmployeeListVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pk.common.util.Response;

@RestController
public class GetEmployeeApi {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value = "/getEmployee", produces = APPLICATION_JSON_VALUE)
	public Response<EmployeeListVo> getTrainProfiles(final HttpServletRequest request,
			final HttpServletResponse response) {
		EmployeeListVo employeeList = new EmployeeListVo();
		employeeList.setEmployees(employeeService.listUsers());
		return new Response<>(employeeList);
	}

	@GetMapping(value = "/controllerAdviceDefault", produces = APPLICATION_JSON_VALUE)
	public Response<EmployeeListVo> getValidationMessage(final HttpServletRequest request,
			final HttpServletResponse response) {
		EmployeeListVo employeeList = new EmployeeListVo();
		employeeList.setEmployees(employeeService.showValidationMessage());
		return new Response<>(employeeList);
	}

}