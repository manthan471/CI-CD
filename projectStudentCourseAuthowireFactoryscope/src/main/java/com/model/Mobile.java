package com.model;

public class Mobile {
	
	private int mobile_id;
	private String mobile_name;
	public Mobile() {
		super();
	}
	public Mobile(int mobile_id, String mobile_name) {
		super();
		this.mobile_id = mobile_id;
		this.mobile_name = mobile_name;
	}
	public int getMobile_id() {
		return mobile_id;
	}
	public void setMobile_id(int mobile_id) {
		this.mobile_id = mobile_id;
	}
	public String getMobile_name() {
		return mobile_name;
	}
	public void setMobile_name(String mobile_name) {
		this.mobile_name = mobile_name;
	}

	
	
	

}
