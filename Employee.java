package com.streams;

public class Employee {
	private String name;
	private String designation;
	private int salary;
	private boolean isMale;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public boolean getIsMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public Employee(String name, String designation, int salary, boolean isMale) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.isMale = isMale;
	}
	@Override
	public String toString() {
		return "Name=" + name + ", Designation=" + designation + ", Salary=" + salary + ", IsMale=" + isMale;
	}
	
	

}
