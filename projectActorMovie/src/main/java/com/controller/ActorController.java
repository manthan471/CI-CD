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

import com.dao.ActorRepository;
import com.model.Actor;
import com.model.Movie;

import Exception.ActorNotFoundException;

@RestController
public class ActorController {
	
	@Autowired
	private ActorRepository actorrepo;
	
	
	//add
	@PostMapping("/actor/add")
	public void addActor(@RequestBody Actor actor) {
		
		
	actorrepo.save(actor);
		
	
	}
	
	//get
	@GetMapping("/actor/get/{id}")
	public Actor getById(@PathVariable int id) {
		Actor actor=actorrepo.findById(id).orElseThrow(()-> new ActorNotFoundException("Actor not found"));
		
		return actor;
	}
	
	//getA
	@GetMapping("/actor/getAll")
	public List<Actor> getAll(){
	return	actorrepo.findAll();
	}
	
	@DeleteMapping("/actor/delete/{id}")
	public void deleteById(@PathVariable int id) {
		Actor actor=actorrepo.findById(id).orElseThrow(()-> new ActorNotFoundException("Actor not found"));
		actorrepo.delete(actor);
		
		
	}
	
	//Update
	@PutMapping("/update/{id}")
	public Actor updateActor(@RequestBody Actor actor,@PathVariable int id) {
		
		Actor actor1=actorrepo.findById(id).orElseThrow(()-> new ActorNotFoundException("Actor not found"));
		actor1.setActor_name(actor.getActor_name());
		actor1.setActor_salary(actor.getActor_salary());
		
		if(actor.getMovie()!=null) {
			actor1.getMovie().clear();
			actor.getMovie().forEach(movie-> { 
				movie.setActor(actor1);
				actor1.getMovie().add(movie);
			});
		}
		
		
		return actorrepo.save(actor1);
		
		
	}

	 
	
	
	
	
	

}
