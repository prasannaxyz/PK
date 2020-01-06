package org.PK.Spring.Rest.Services.Get.services;

import java.util.List;

import org.PK.Spring.Rest.Services.Get.common.GetEmployeeErrorMessages;
import org.PK.Spring.Rest.Services.Get.common.GetEmployeeProfileMessageCode;
import org.PK.Spring.Rest.Services.Get.dao.EmployeeDao;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;
import com.pk.common.exception.BusinessException;
import com.pk.common.vo.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Transactional(readOnly = true)
	@Override
	public List<Employee> listUsers() {
		List<Employee> employees = employeeDao.listUsers();

		return employees;
	}

	@Override
	public List<Employee> showValidationMessage() {
		List<Employee> employees = Lists.newArrayList();

		if (CollectionUtils.isEmpty(employees)) {
			throw BusinessException.create(GetEmployeeProfileMessageCode.EMPLOYEE_NOT_FOUND.withParams(GetEmployeeErrorMessages.DOMAIN_NAME));
		}

		return employees;
	}

}