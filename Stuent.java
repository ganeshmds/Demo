package com.streams;

public class Stuent {
	private String name;
	private int rollno;
	private int std;
	private String commence;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public String getCommence() {
		return commence;
	}
	public void setCommence(String commence) {
		this.commence = commence;
	}
	public Stuent(String name, int rollno, int std, String commence) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.std = std;
		this.commence = commence;
	}
	
	public String toString() {
		return " name=" + name + ", rollno=" + rollno + ", std=" + std + ", commence=" + commence ;
	}
	

}
