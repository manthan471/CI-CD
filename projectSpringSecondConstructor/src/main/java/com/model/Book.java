package com.model;

public class Book {
	private int book_Id;
	private String book_name;
	
	private Author author;

	public Book() {
		super();
	}

	public Book(int book_Id, String book_name, Author author) {
		super();
		this.book_Id = book_Id;
		this.book_name = book_name;
		this.author = author;
	}

	public int getBook_Id() {
		return book_Id;
	}

	public void setBook_Id(int book_Id) {
		this.book_Id = book_Id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public String toString() {
		return book_Id+" "+book_name+" "+author;
		
	}

}
