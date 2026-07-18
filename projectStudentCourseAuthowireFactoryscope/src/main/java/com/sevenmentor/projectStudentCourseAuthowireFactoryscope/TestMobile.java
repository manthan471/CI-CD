package com.sevenmentor.projectStudentCourseAuthowireFactoryscope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Mobile;



public class TestMobile {

	public static void main(String[] args) {
	       
	      ApplicationContext context=new ClassPathXmlApplicationContext("mobile.xml");
	        
	        Mobile mobile=(Mobile) context.getBean("a");
	        
	       System.out.println(mobile);
	        
	       
	        Mobile mobile1=(Mobile) context.getBean("a");
	        
	        System.out.println(mobile1);

	}

}
