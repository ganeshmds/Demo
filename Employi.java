package com.hashMap;

public class Employi {
	private String name;
	private String fathersName;
	private int id;
	private int age;
	private boolean isMale;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFathersName() {
		return fathersName;
	}
	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean getIsMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employi(String name, String fathersName, int id, int age, int salary,boolean isMale) {
		super();
		this.name = name;
		this.fathersName = fathersName;
		this.id = id;
		this.age = age;
		this.isMale = isMale;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employi [name=" + name + ", fathersName=" + fathersName + ", id=" + id + ", age=" + age + ", isMale="
				+ isMale + ", salary=" + salary + "]";
	}
	
	

}
