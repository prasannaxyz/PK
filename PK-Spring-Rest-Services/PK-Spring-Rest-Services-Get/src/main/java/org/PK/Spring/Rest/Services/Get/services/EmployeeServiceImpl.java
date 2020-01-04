package org.PK.Spring.Rest.Services.Get.services;

import java.util.List;

import org.PK.Spring.Rest.Services.Get.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pk.common.vo.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

   @Autowired
   private EmployeeDao employeeDao;

  

   @Transactional(readOnly = true)
   @Override
   public List<Employee> listUsers() {
      return employeeDao.listUsers();
   }

}