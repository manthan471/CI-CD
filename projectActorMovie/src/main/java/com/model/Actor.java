package com.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Actor {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int actor_id;
	private String actor_name;
	private int actor_salary;
	
	
	@OneToMany(mappedBy="actor",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JsonManagedReference
	List<Movie> movie = new ArrayList<>();


	public Actor() {
		super();
	}


	public Actor(int actor_id, String actor_name, int actor_salary, List<Movie> movie) {
		super();
		this.actor_id = actor_id;
		this.actor_name = actor_name;
		this.actor_salary = actor_salary;
		this.movie = movie;
	}


	public int getActor_id() {
		return actor_id;
	}


	public void setActor_id(int actor_id) {
		this.actor_id = actor_id;
	}


	public String getActor_name() {
		return actor_name;
	}


	public void setActor_name(String actor_name) {
		this.actor_name = actor_name;
	}


	public int getActor_salary() {
		return actor_salary;
	}


	public void setActor_salary(int actor_salary) {
		this.actor_salary = actor_salary;
	}


	public List<Movie> getMovie() {
		return movie;
	}


	public void setMovie(List<Movie> Movie) {
		this.movie = Movie;
	}
	
	
	
	
	
	

}
