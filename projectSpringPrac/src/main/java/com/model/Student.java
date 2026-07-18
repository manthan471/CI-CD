package com.model;

public class Student {
	
	private int stu_id;
    private String stu_name;
    
    private Exam exam;

	public Student() {
		super();
	}

	public Student(int stu_id, String stu_name, Exam exam) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.exam = exam;
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

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public String toString() {
		return stu_id+" "+stu_name+" "+exam;
		
	}
    

}
