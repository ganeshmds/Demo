package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UseStudent {
	public static void main(String[] args) {
		Stuent s1=new Stuent("Ganzh",16,12,"Bus");
		Stuent s5=new Stuent("Reena",14,11,"Bike");
		Stuent s2=new Stuent("Srinidhi",15,12,"Bus");
		Stuent s3=new Stuent("Arun",17,10,"Helicopter");
		Stuent s4=new Stuent("Vizhwa",48,12,"Auto");
		ArrayList<Stuent>s=new ArrayList<>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
//		s.stream().filter(x->x.getRollno()>15).map(y->y.getName()).forEach(a->System.out.println(a));
//	List<String>l=	s.stream().filter(x->x.getName().startsWith("S")).map(y->y.getName()).collect(Collectors.toList());
//		for(String a:l) {
//			System.out.println(a);
//		}
////	s.stream().filter(x->x.getCommence()=="Bus").map(y->y.getName()).forEach(a->System.out.println(a));
//		List<Integer>l=s.stream().filter(x->x.getRollno()>15).map(y->y.getRollno()).collect(Collectors.toList());
//		for(Integer a:l) {
//			System.out.println(a);
//		}
//		s.stream().filter(x->x.getStd()>10).map(y->y.getName()).forEach(a->System.out.println(a));
//		Map<Integer,Stuent>m=s.stream().filter(x->x.getName().startsWith("G")).collect(Collectors.toMap(Stuent::getRollno,Function.identity()));
//		m.forEach((a,b)->{
//		System.out.println(a+" "+b);
//			});
//		Map<String,Stuent>l=s.stream().filter(x->x.getCommence()=="Bus").collect(Collectors.toMap(Stuent::getName,Function.identity()));
//				l.forEach((a,b)->System.out.println(a+" "+b));
		Map<String,String>l=s.stream().filter(x->x.getRollno()>11).collect(Collectors.toMap(Stuent::getName,Stuent::getCommence));
		l.forEach((a,b)->{System.out.println(a+" "+b);});
	}

}
