package com.autowired_bean_configuration;

import org.springframework.beans.factory.annotation.Autowired;


public class Employee {
	
	
	@Autowired
	Address address;

	public Employee() {
		super();
	}

	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		address.show();
	}

}
