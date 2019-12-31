package com.mphasis.dao;

import javax.sql.DataSource;

public interface EmployeeDao {

	public void setDataSource(DataSource ds);

	public void inEmployee(int empId, String name);

	//public Employee getStudent(int empId);

	//public List<Employee> listEmployees();

	//public void delete(Integer id);

	//public void update(Integer id, Integer age);
}
