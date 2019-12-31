package com.mphasis.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.mphasis.bean.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setName(rs.getString("name"));
		employee.setEmpId(rs.getInt("empId"));
		employee.setDate(rs.getString("date"));
		employee.setInTime(rs.getString("inTime"));
		employee.setOutTime(rs.getString("outTime"));
		
		return employee;
	}

}
