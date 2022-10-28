package com.hashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class UseStaff {
	public static void main(String [] args) {
		Satff s1=new Satff("Isai","Trainee",12,25000,false);
		Satff s2=new Satff("Srinidhi","Trainee",13,35000,false);
		Satff s3=new Satff("Ganzh","Team Leader",14,45000,true);
		Satff s4=new Satff("Simbhu","Executive",15,25000,true);
		Satff s5=new Satff("Arun","Trainee",16,15000,true);
		Satff s6=new Satff("Dinesh","Manager",17,65000,true);
		HashMap<Integer,Satff>sf=new HashMap<>();
		sf.put(s6.getId(), s6);
		sf.put(s5.getId(), s5);
		sf.put(s4.getId(), s4);
		sf.put(s3.getId(), s3);
		sf.put(s2.getId(), s2);
		sf.put(s1.getId(), s1);
		ArrayList<String>al=new ArrayList<>();
		/*for(Satff x:sf.values()) {
			if(x.getSalary()>=30000) {
				al.add(x.getName());
				
			}
		}*/
		sf.values().forEach(x->{if(x.getSalary()>=30000 ){al.add(x.getName());}});
			System.out.println(al);		
		
		}
}
