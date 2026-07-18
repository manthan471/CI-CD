package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentRepository;
import com.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public Student addStudent(Student s) {
		
		return studentRepo.save(s);
	}

	@Override
	public Student getOneStudent(int id) {

       Student s=studentRepo.findById(id).orElseThrow(()->new RuntimeException());
       
		
		return null;
	}
	
	public List<Student> getAll(){
		return studentRepo.findAll()
	}
	
	

}
