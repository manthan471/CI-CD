package com.autowired_bean_configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEmployeeAddress {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		Employee e=context.getBean(Employee.class);
		e.display();
		
	}

}
