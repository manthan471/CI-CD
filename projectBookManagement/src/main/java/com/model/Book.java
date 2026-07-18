package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	
	
	@Id
	private int book_id;
	private String book_name;
	private int book_price;
	public Book() {
		super();
	}
	public Book(int book_id, String book_name, int book_price) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_price = book_price;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public int getBook_price() {
		return book_price;
	}
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	
	

}
