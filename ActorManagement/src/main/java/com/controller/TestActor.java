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

import com.dao.ActorRepository;
import com.model.Actor;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class TestActor {
	
	@Autowired
	ActorRepository repo;
	
	
	//get actor details
	@GetMapping("/actors")
	public List<Actor> getAllActors(){
		
		List<Actor> list=repo.findAll();
		
		return list;
		
	}
	
	//get particular acotr details
	@GetMapping("/actors/{id}")
	public Actor getActor(@PathVariable int id) {
		Actor a1=repo.findById(id).get();
		
		return a1;
		
	}
	
	@PostMapping("/actors/add")
	public void createActor(@RequestBody Actor actor) {
		repo.save(actor);
		
	}
	
	//to update first find then set then save
	@PutMapping("/actors/update/{id}")
	public Actor updateStudent(@PathVariable int id) {
		
	Actor a2=	repo.findById(id).get();
	
	a2.setName("sidharth");
	a2.setSalary(1000);
	repo.save(a2);
	return a2;
	
	}
	
	
     @DeleteMapping("/actors/delete/{id}")
     public void deleteActor(@PathVariable int id) {
    	Actor a3= repo.findById(id).get();
    	 repo.delete(a3);
    	 
     }
   
     
     //Find By Email
     @GetMapping("/actors/email/{email}")
     public Actor getByEmail(@PathVariable String email) {
    	
    	 Actor actor = repo.findByEmail(email);
    	 
    	 return actor;
    	 
     }
	//Find By Name
     @GetMapping("/actors/name/{name}")
     public Actor getByName(@PathVariable String name) {
    	Actor actor= repo.findByName(name);
    	 return actor;
    	 
     }
     
     @GetMapping("/actors/High-Salary")
     public List<Actor> getsalary(){
    	return repo.findBySalary();
     }
     
     @GetMapping("/actors/InfoOfActorWhoHasMinimumSalary")
     public List<Actor> getminsalary(){
    	 
    	 return repo.findminimumSalary();
    	 
    	 
    	 
     }
}
