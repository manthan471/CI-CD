package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.CustomerRepository;
import com.exception.CustomerNotFoundException;
import com.model.Customer;
import com.model.Product;

@RestController
public class CustomerController {
   
	@Autowired
	CustomerRepository cusrepo;
	
	
	//here we use cascade so we dont have to save product sepratly
	@PostMapping("/customer/add")
	public void addCustomer(@RequestBody Customer customer) {
		cusrepo.save(customer);
	
		
	}
	
	@GetMapping("/get/{cusid}")
	public Customer getCustomer(@PathVariable int cusid) {
		Customer customer = cusrepo.findById(cusid).orElseThrow(()-> new CustomerNotFoundException("Customer not found"));
		return customer;
		
	}
	
	@GetMapping("/get")
	public List<Customer> getAllCustomer(){
		List<Customer> list=cusrepo.findAll();
		
		return list;
	}
	
	@DeleteMapping("/delete/{cusid}")
	public void deleteCustomer(@PathVariable int cusid) {
	Customer customer=	cusrepo.findById(cusid).orElseThrow(()->new CustomerNotFoundException("Customer not found"));
	
	cusrepo.delete(customer);
	
		
	}
	
	@PutMapping("/update/{cusid}")
	public Customer updateCustomer(@PathVariable int cusid,
	                               @RequestBody Customer customer) {

	    Customer existingcustomer = cusrepo.findById(cusid)
	            .orElseThrow(() -> new CustomerNotFoundException("Customer not found"));

	    // Update basic fields
	    existingcustomer.setCustomerName(customer.getCustomerName());
	    existingcustomer.setCustomerEmail(customer.getCustomerEmail());

	    // Update product list if not null
	    if (customer.getProduct() != null) {

	        existingcustomer.getProduct().clear();

	        customer.getProduct().forEach(prod -> {
	            prod.setCustomer(existingcustomer);
	            existingcustomer.getProduct().add(prod);
	        });
	    }

	    return cusrepo.save(existingcustomer);
	}

	
	
	
	
	
	
	
}
