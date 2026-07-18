package com.model;

import java.util.List;

public class Customer {
	
	private int cus_id;
	private String cus_name;
	
	List<Reviews> list;

	public Customer() {
		super();
	}

	public Customer(int cus_id, String cus_name, List<Reviews> list) {
		super();
		this.cus_id = cus_id;
		this.cus_name = cus_name;
		this.list = list;
	}

	public int getCus_id() {
		return cus_id;
	}

	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}

	public String getCus_name() {
		return cus_name;
	}

	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}

	public List<Reviews> getList() {
		return list;
	}

	public void setList(List<Reviews> list) {
		this.list = list;
	}
	
 public String toString() {
	 return cus_id+" "+cus_name+" "+list;
	 
 }
	
	

}
