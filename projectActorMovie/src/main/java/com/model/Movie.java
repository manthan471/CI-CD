package com.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int movie_id;
	private String movie_name;
	private long movie_budget;
	
	
	@ManyToOne
	@JoinColumn(name="actor_id")
	@JsonBackReference
	private Actor actor;


	public Movie() {
		super();
	}


	public Movie(int movie_id, String movie_name, long movie_budget, Actor actor) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.movie_budget = movie_budget;
		this.actor = actor;
	}


	public int getMovie_id() {
		return movie_id;
	}


	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}


	public String getMovie_name() {
		return movie_name;
	}


	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}


	public long getMovie_budget() {
		return movie_budget;
	}


	public void setMovie_budget(long movie_budget) {
		this.movie_budget = movie_budget;
	}


	public Actor getActor() {
		return actor;
	}


	public void setActor(Actor actor) {
		this.actor = actor;
	}
	
	
	
}
