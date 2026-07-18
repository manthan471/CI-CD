package com.autowired_component_configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Car {
	
	
	@Autowired
	Engine engine;

	public Car() {
		super();
	}

	public Car(Engine engine) {
		super();
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void display() {
		engine.startEnigine();
	}
	
	

}
