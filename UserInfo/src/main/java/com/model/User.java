package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class User {
	
	
	@Id
	private int user_id;
	private String user_name;
	private String user_adress;
	private String user_contact;
	
	@Lob
	@Column(columnDefinition="LONGBLOB")
	private byte[] user_image_data;

	public User() {
		super();
	}

	public User(int user_id, String user_name, String user_adress, String user_contact, byte[] user_image_data) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_adress = user_adress;
		this.user_contact = user_contact;
		this.user_image_data = user_image_data;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_adress() {
		return user_adress;
	}

	public void setUser_adress(String user_adress) {
		this.user_adress = user_adress;
	}

	public String getUser_contact() {
		return user_contact;
	}

	public void setUser_contact(String user_contact) {
		this.user_contact = user_contact;
	}

	public byte[] getUser_image_data() {
		return user_image_data;
	}

	public void setUser_image_data(byte[] user_image_data) {
		this.user_image_data = user_image_data;
	}
	
	

}
