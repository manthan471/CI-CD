package com.service;

import java.util.List;

import com.model.Student;

public interface StudentService {
	
	public Student addStudent(Student s);
	public Student getOneStudent(int id);
	
	public List<Student> getAll();
	

}
