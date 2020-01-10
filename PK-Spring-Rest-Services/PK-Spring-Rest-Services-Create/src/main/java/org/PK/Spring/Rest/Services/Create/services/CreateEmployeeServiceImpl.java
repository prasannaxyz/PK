package org.PK.Spring.Rest.Services.Create.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.common.vo.Employee;

@Service
public class CreateEmployeeServiceImpl implements CreateEmployeeService {

	@Autowired
	private LockImplementation lockImpl;
	
	@Override
	public Employee createUser() {
		System.out.println("Create Employee Service.");
		lockImpl.testAspect();
		return null;
	}

	

}