package com.sm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.sm", "com.controller","com.model", "com.dao", "com.service"})
@EntityScan("com.model")
@EnableJpaRepositories(basePackages="com.dao")
public class ProjectImgaeGallaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectImgaeGallaryApplication.class, args);
	}

}
