package com.model;

public class Author {
	
	private int author_Id;
	private String author_name;
	public Author() {
		super();
	}
	public Author(int author_Id, String author_name) {
		super();
		this.author_Id = author_Id;
		this.author_name = author_name;
	}
	public int getAuthor_Id() {
		return author_Id;
	}
	public void setAuthor_Id(int author_Id) {
		this.author_Id = author_Id;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	
	public String toString() {
		return author_Id+" "+author_name;
	}

}
