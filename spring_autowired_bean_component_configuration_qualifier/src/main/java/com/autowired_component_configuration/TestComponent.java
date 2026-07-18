package com.autowired_component_configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestComponent {
	
	public static void main(String[] args) {
ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		Car c=context.getBean(Car.class);
		c.display();
		
	}

}
