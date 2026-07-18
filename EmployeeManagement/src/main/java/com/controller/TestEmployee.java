package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.EmployeeRepository;
import com.model.Employee;

@RestController
@CrossOrigin(origins="https://localhost:3000")
public class TestEmployee {

	       @Autowired
	       EmployeeRepository repo;
	       
	       
	       @PostMapping("/employee/add")
	       public void addEmployee(@RequestBody Employee e) {
	    	   
	    	   repo.save(e);
	    	   
	    	   
	       }
	       
	       @GetMapping("/employee")
	       public List<Employee> getEmployee(){
	    	   
	    	List<Employee> list=repo.findAll();
	    	
	    	   return list;
	    	   
	       }
	       
	       @GetMapping("/employee/{id}")
	       public Employee getEmployeeById(@PathVariable int id) {
	    	   
	    	 Employee e=  repo.findById(id).get();
	    	   
	    	   
	    	   return e;
	    	   
	    	   
	       }
	       
	       
	       @DeleteMapping("/employee/delete/{id}")
	       public void deleteEmployee(@PathVariable int id) {
	    	   
	    	  Employee e1= repo.findById(id).get();
	    	   repo.delete(e1);
	    	   
	       }
	       
	       
	       @PutMapping("/employee/update/{id}")
	       public Employee updateEmployee(@PathVariable int id) {
	    	Employee e3=   repo.findById(id).get();
	    	   e3.setEmp_name("omkar");
	    	   e3.setEmp_salary(100);
	    	   
	    	   repo.save(e3);
	    	   
	    	   return e3;
	    	   
	       }
	       
	
	
}
