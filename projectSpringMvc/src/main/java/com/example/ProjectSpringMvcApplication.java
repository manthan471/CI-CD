package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.demo","com.controller"})
public class ProjectSpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectSpringMvcApplication.class, args);
	}

}
