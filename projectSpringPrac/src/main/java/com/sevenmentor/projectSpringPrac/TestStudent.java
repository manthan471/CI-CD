package com.sevenmentor.projectSpringPrac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class TestStudent {

	public static void main(String[] args) {
		
		 ApplicationContext context=new ClassPathXmlApplicationContext("Student.xml");  //xml_bean file name
		 
              Student s1=   (Student) context.getBean("stu1");  //main class id
                System.out.println(s1);  
                
              Student s2= (Student)context.getBean("stu2");
              System.out.println(s2);
	}

}
