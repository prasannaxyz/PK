package org.PK.Spring.Rest.Services.Get.dao;

import java.util.List;

import com.pk.common.vo.Employee;

public interface EmployeeDao {
   List<Employee> listUsers();
}