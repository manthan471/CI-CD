package com.sevenmentor.projectSpringFirst;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.model.Adress;
import com.model.Employee;


public class TestEmp {

	public static void main(String[] args) {
		
		
		        
		        //Normal core java
		        /*
		        Address add=new Address(1064,"pimpari","pune");
		        
		        Employee e=new Employee(1,"ajay",add);
		        */
		        
		        ApplicationContext context=new ClassPathXmlApplicationContext("Emp.xml");
		        
		        Employee e=(Employee)context.getBean("emp");
		       System.out.println(e);
		        
		    }

		}

	


