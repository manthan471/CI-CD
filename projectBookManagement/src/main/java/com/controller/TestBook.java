package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Book;
import com.service.BookService;


@RestController
public class TestBook {

	
		
		@Autowired
		private BookService service;
		
		

		
		@PostMapping("/add")
		public Book addStudent(@RequestBody Book b) {
		Book b1= service.addBook(b);
			return b1;
		}

}
