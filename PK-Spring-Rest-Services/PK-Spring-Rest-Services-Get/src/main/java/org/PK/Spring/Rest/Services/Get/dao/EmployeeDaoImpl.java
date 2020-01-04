package org.PK.Spring.Rest.Services.Get.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pk.common.vo.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Employee> listUsers() {
		@SuppressWarnings("unchecked")
		TypedQuery<Employee> query = sessionFactory.getCurrentSession().createQuery("from Employee");
		return query.getResultList();
	}

}