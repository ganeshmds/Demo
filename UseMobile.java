package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseMobile {
	public static void main(String[] args) {
		   Mobile m1=new Mobile("Mi",9000,false);
		Mobile m2=new Mobile("Honor",18000,true);
		Mobile m3=new Mobile("Oppo",29000,false);
		Mobile m4=new Mobile("Vivo",19000,true);
		ArrayList<Mobile> m=new ArrayList<>();
		m.add(m4);
		m.add(m2);
		m.add(m3);
		m.add(m1);
//		 List<Mobile>l= m.stream().filter(x->x.getIsWarranty()==true).collect(Collectors.toList());
//		for(Mobile y:l) {
//			System.out.println(y.getPrice()-1000+" "+y.getBrand()+" "+y.getIsWarranty());
//		}
//		m.stream().filter(x->x.getIsWarranty()==true).forEach(a->System.out.println(a));
		
////     List <Mobile>l=m.stream().filter(x->x.getPrice()>10000).collect(Collectors.toList());
//		for(Mobile y:l) {
//		System.out.println(y);
////	}
//		List<String>l=m.stream().map(x->x.getBrand()).collect(Collectors.toList());
//		for(String y:l) {
//			System.out.println(y);
//		}
//		
//		m.stream().filter(x->x.getIsWarranty()==false).map(y->y.getBrand()).forEach(z->System.out.println(z));
//		long b=m.stream().count();
//		System.out.println(b);
		long b= m.stream().filter(x->x.getPrice()>=19999).map(y->y.getBrand()).count();
		System.out.println(b);
	}
}
