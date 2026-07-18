package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/add")
	public String addition(@RequestParam("num1") int n1,
	                       @RequestParam("num2") int n2,
	                       Model model) {
		
		int res = n1 + n2;
		
		model.addAttribute("r", res);
		
		return "result";
	}
}