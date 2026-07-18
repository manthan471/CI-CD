package com.sevenmentor.projectStudentCourseAuthowireFactoryscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Demo;

public class TestDemo {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("factory.xml");
	      
        Demo demo=(Demo) context.getBean("a");
        
        demo.msg();
		

	}

}
