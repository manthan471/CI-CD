package com.sevenmentor.projectStudentCourseAuthowireFactoryscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class TestStudent {

	public static void main(String[] args) {
	
		ApplicationContext context =
			    new ClassPathXmlApplicationContext("SCAuthowirebyType.xml");
		
		Student s1=(Student)context.getBean("s");
		System.out.println(s1);

	}

}
