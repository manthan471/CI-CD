package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.manthan.controller", "com.manthan.dao", "com.manthan.model","com.manthan.service"})
@EntityScan("com.manthan.model")
@EnableJpaRepositories("com.manthan.dao")
public class ProjectSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectSpringApplication.class, args);
	}

}
