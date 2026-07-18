package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String greet(HttpServletRequest request) {
		
		return "Welcome to SM"+request.getSession().getId();
		
	}
	
	

}
