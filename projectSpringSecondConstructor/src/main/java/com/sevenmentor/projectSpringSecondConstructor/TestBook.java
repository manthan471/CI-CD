package com.sevenmentor.projectSpringSecondConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Book;
public class TestBook {

	public static void main(String[] args) {
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("Book.xml");
		ApplicationContext context =
			    new ClassPathXmlApplicationContext("cnamespace.xml");

		Book book = (Book)context.getBean("b");
		
		System.out.println(book);
		



	}

}
