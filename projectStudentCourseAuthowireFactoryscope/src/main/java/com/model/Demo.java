package com.model;

public class Demo {
	
	public static Demo ob=null;
	
	private Demo() {}
	
	public static Demo getDemo() {
		
		
		if(ob==null) {
			ob=new Demo();
			
		}
		return ob;
		
	}
	
	public void msg() {
		System.out.println("Inside Demo class method");
	}

}
