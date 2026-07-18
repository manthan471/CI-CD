package com.sevenmentor.projectSpringprac2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Customer;

public class TestCustomer {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Customer.xml");
		Customer c=(Customer)context.getBean("c1");
		System.out.println(c);

	}

}
