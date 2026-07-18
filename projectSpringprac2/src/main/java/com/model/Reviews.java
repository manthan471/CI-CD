package com.model;

public class Reviews {
	
	private int id;
	private String content;
	public Reviews() {
		super();
	}
	public Reviews(int id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String toString() {
		return id+" "+content;
		
	}
	
	

}
