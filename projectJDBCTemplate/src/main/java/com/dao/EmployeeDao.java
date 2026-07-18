package com.dao;
import org.springframework.jdbc.core.JdbcTemplate;

import com.model.Employee;

public class EmployeeDao {
	
	private JdbcTemplate JdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return JdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		JdbcTemplate = jdbcTemplate;
	}
	
	public int saveEmployee(Employee e) {
		String sql ="insert into emp values(?,?,?)";
		return JdbcTemplate.update(sql,e.getId(),e.getName(),e.getSalary());
	}
	

	
	
	
	

}
