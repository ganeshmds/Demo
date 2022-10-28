package com.hashMap;

public class Studentt {
	private String name;
	private int age;
	private int rollNo;
	private boolean isMale;
	private char grade;
	
	public void setName(String a) {
		name=a;
	}
	public void setAge(int b) {
		age=b;
	}
	public void setRollNo(int c) {
		rollNo=c;
	}
	public void setIsMale(boolean d) {
		isMale=d;
	}
	public void setGrade(char e) {
		grade=e;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int  getRollNo() {
		return rollNo;
	}
	public boolean getIsMale() {
		return isMale;
	}
	public char getGrade() {
		return grade;
	}
	Studentt(String a,int b,int c,boolean d,char e){
		name=a;
		age=b;
		rollNo=c;
		isMale=d;
		grade=e;
	}
	public String toString() {
		return name+" "+age+" "+rollNo+" "+isMale+" "+grade;
	}

	

}
