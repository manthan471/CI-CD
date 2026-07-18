package com.model;

public class Exam {
	
	private int exam_id;
	private String exam_name;
	private int exam_marks;
	public Exam() {
		super();
	}
	public Exam(int exam_id, String exam_name, int exam_marks) {
		super();
		this.exam_id = exam_id;
		this.exam_name = exam_name;
		this.exam_marks = exam_marks;
	}
	public int getExam_id() {
		return exam_id;
	}
	public void setExam_id(int exam_id) {
		this.exam_id = exam_id;
	}
	public String getExam_name() {
		return exam_name;
	}
	public void setExam_name(String exam_name) {
		this.exam_name = exam_name;
	}
	public int getExam_marks() {
		return exam_marks;
	}
	public void setExam_marks(int exam_marks) {
		this.exam_marks = exam_marks;
	}
	
	public String toString() {
		return exam_id+" "+exam_name+" "+exam_marks;
		
	}
	
	

}
