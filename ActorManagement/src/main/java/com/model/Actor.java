package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Actor {
	
	@Id
	private int actor_id;
	private String name;
	private int salary;
	private String email;
	public Actor() {
		super();
	}
	public Actor(int actor_id, String name, int salary, String email) {
		super();
		this.actor_id = actor_id;
		this.name = name;
		this.salary = salary;
		this.email = email;
	}
	public int getActor_id() {
		return actor_id;
	}
	public void setActor_id(int actor_id) {
		this.actor_id = actor_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
