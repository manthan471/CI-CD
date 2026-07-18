package com.autowired_bean_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Address getAddress() {
		
		return new Address();
		
	}
	
	@Bean
	public Employee getEmployee() {
		return new Employee();
		
	}
	

}
