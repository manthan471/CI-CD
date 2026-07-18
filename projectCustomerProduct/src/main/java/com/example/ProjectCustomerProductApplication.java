package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.controller", "com.dao", "com.model"})
@EntityScan("com.model")
@EnableJpaRepositories("com.dao")

public class ProjectCustomerProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectCustomerProductApplication.class, args);
	}

}
