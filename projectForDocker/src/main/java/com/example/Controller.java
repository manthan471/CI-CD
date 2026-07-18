package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	@GetMapping("/get/welcome")
	public String display() {
		return "Welcome to the World Of Coders";
	}

}
