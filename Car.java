package com.hashMap;

public class Car {
	private String brand;
	private String color;
	private int price;
	private String regNo;
	private boolean isPetrol;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public boolean getIsPetrol() {
		return isPetrol;
	}
	public void setPetrol(boolean isPetrol) {
		this.isPetrol = isPetrol;
	}
	public Car(String brand, String color, String regNo,int price,  boolean isPetrol) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.regNo = regNo;
		this.isPetrol = isPetrol;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", price=" + price + ", regNo=" + regNo + ", isPetrol="
				+ isPetrol + "]";
	}
	
	

}
