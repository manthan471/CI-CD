package com.model;

public class Employee {

	private int empId;
	private String empName;
	private Adress adress;
	public Employee() {
		super();
	}
	public Employee(int empId, String emName, Adress adress) {
		super();
		this.empId = empId;
		this.empName = emName;
		this.adress = adress;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String emName) {
		this.empName = emName;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	} 
	public String toString() {
		return empId+" "+empName+" "+adress;
	}
	
}
