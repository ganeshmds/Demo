package com.hashMap;

public class Satff {
	private String name;
	private int id;
	private int salary;
	private String designtaion;
	private boolean isMale;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesigntaion() {
		return designtaion;
	}
	public void setDesigntaion(String designtaion) {
		this.designtaion = designtaion;
	}
	public boolean getIsMale() {
		return isMale;
	}
	public void setIsMale(boolean isMale) {
		this.isMale = isMale;
	}
	public Satff(String name, String designtaion,int id, int salary,  boolean isMale) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.designtaion = designtaion;
		this.isMale = isMale;
	}
	@Override
	public String toString() {
		return "Satff [name=" + name + ", id=" + id + ", salary=" + salary + ", designtaion=" + designtaion
				+ ", isMale=" + isMale + "]";
	}

}
