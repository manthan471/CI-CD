package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	
	@PostMapping("/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student s) {
		Student stu=service.addStudent(s);
		return ResponseEntity.status(HttpStatus.CREATED).header("add","adding record").body(stu);
	}
	
	@GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAll() {
        
         List<Student> s=  service.getAll();
         
         return ResponseEntity.status(HttpStatus.OK).header("get","get one record").body(s);
    }

}
