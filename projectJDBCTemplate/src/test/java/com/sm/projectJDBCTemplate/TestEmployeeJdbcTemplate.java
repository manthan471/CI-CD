package com.sm.projectJDBCTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.model.Employee;



public class TestEmployeeJdbcTemplate {

	public static void main(String[] args) {
		
		
ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		Employee e=context.getBean(Employee.class);
		
	}

}
