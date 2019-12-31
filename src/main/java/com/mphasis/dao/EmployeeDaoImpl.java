package com.mphasis.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mphasis.bean.Employee;
import com.mphasis.util.EmployeeUtil;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource myPoolDataSource) {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(myPoolDataSource);
	}

	public void inEmployee(int empId, String name) {
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("name", name);
		param.addValue("empId", empId);
		param.addValue("date", EmployeeUtil.getDate());
		param.addValue("inTime", EmployeeUtil.getTime());
		//param.addValue("name", "name");
		int rowUpdated = jdbcTemplate.update("insert into emp_attendance (name,empId,date,inTime) value(:name,:empId,:date,:inTime)", param);
		
		if(rowUpdated!=0) {
			System.out.println("signed in successfully");
		}else {
			System.out.println("problem while doing sign in");
		}
	}
	
	public boolean isEmployeeHasSignedIn(int empId) {
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("id", empId);
		Employee emp = jdbcTemplate.queryForObject("select * from emp_attendance where empId=:id", param, new EmployeeMapper());
		//System.out.println(emp);
		if(empId==emp.getEmpId() && EmployeeUtil.getDate().equals(emp.getDate())) return true;
		else return false; 
	}
	
	public void outEmployee(int empId) {
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("id", empId);
		param.addValue("outTime", EmployeeUtil.getTime());
		int rowUpdated = jdbcTemplate.update("update emp_attendance set outTime=:outTime where empId=:id", param);
		
		if(rowUpdated!=0) {
			System.out.println("signed out successfully");
		}else {
			System.out.println("problem while doing sign out");
		}
	}

}
