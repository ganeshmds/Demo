package com.streams;

public class Mobile {
	private String brand;
	private int price;
	private boolean isWarranty;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean getIsWarranty() {
		return isWarranty;
	}
	public void setWarranty(boolean isWarranty) {
		this.isWarranty = isWarranty;
	}
	public Mobile(String brand, int price, boolean isWarranty) {
		super();
		this.brand = brand;
		this.price = price;
		this.isWarranty = isWarranty;
	}
	@Override
	public String toString() {
		return "Brand:" + brand + ", price:" + price + ", isWarranty:" + isWarranty;
	}


}
