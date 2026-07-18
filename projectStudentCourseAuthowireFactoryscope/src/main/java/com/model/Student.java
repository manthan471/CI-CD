package com.model;

public class Student {
	
	private int stu_id;
	private String stu_name;
	
	private Course course;
	public Student() {
		super();
	}
	public Student(int stu_id, String stu_name, Course course) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.course = course;
	}
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public String toString() {
		return stu_id+" "+stu_name+" "+course;
		
	}
	
	

}
