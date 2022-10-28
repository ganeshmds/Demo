package com.hashMap;

import java.util.HashMap;

public class UseCar {
	public static void main(String[] args) {
		Car c1=new Car("Bmw","Black","Tn32 4567",4500000,true);
		Car c2=new Car("Buggati","Blue","Tn32 4768",4300000,true);
		Car c3=new Car("Benz","pearlBlue","Tn32 4566",4600000,false);
		Car c4=new Car("Audi","White","Tn32 4569",4500060,true);
		Car c5=new Car("Ferrari","Orange","Tn32 4568",5500000,false);
		
		HashMap<Integer,Car>c=new HashMap<>();
		
		c.put(c5.getPrice(), c5);
		c.put(c4.getPrice(), c4);
		c.put(c3.getPrice(), c3);
		c.put(c2.getPrice(), c2);
		c.put(c1.getPrice(), c1);
//		int max=c1.getPrice();
//		Car b=null;
//		for(Car x:c.values()) {
//			if(x.getIsPetrol()==true&&x.getPrice()>=max) {
//			max=x.getPrice();
//			b=x;
//			}
//		}
//		System.out.println("Highest Petrol price  car: "+b.getBrand());
		c.keySet().forEach(x->{System.out.println(c.get(x));});
		}
	}

