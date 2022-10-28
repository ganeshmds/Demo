package com.hashMap;

public class Cricket {
	private String name;
	private int jersyNo;
	private int Score;
	private boolean isBatsman;
	private int wicketTaken;
	private int age;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public int getJersyNo() {
		return jersyNo;
	}
	public void setJersyNo(int jersyNo) {
		this.jersyNo = jersyNo;
	}
	public int getScore() {
		return Score;
	}
	public void setScore(int score) {
		this.Score = score;
	}
	public boolean getIsBatsman() {
		return isBatsman;
	}
	public void setBatsman(boolean isBatsman) {
		this.isBatsman = isBatsman;
	}
	public int getWicketTaken() {
		return wicketTaken;
	}
	public void setWicketTaken(int wicketTaken) {
		this.wicketTaken = wicketTaken;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Cricket(String name,int jersyNo, int score,  int wicketTaken, int age,boolean isBatsman) {
		super();
		this.name=name;
		this.jersyNo = jersyNo;
		this.Score = score;
		this.isBatsman = isBatsman;
		this.wicketTaken = wicketTaken;
		this.age = age;
	}
	@Override
	public String toString() {
		return name+"jersyNo=" + jersyNo + ", Score=" + Score + ", isBatsman=" + isBatsman + ", wicketTaken="
				+ wicketTaken + ", age=" + age;
	}
	


}
