package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.CustomerRepository;
import com.dao.ProductReposiotory;
import com.model.Customer;
import com.model.Product;


@RestController
public class ProductController {
	

	@Autowired
	ProductReposiotory prodrepo;
	
	@Autowired
	CustomerRepository cusrepo;
	
	
	@PostMapping("/product/{cusid}")
	public void addProduct(@RequestBody Product product,@PathVariable int cusid) {
		
	Customer customer=	cusrepo.findById(cusid).orElseThrow(null);
	product.setCustomer(customer);
		prodrepo.save(product);
		
	}
	

}
