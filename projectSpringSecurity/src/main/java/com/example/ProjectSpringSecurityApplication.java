package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.sm","com.controller"})

public class ProjectSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectSpringSecurityApplication.class, args);
	}

}
