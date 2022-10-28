package com.hashMap;

import java.util.HashMap;

import java.util.Iterator;

public class UseEmployi {
	public static void main(String[] args) {
		Employi e1=new Employi("Bharath","Selvaraj",01,20,20000,true);
		Employi e2=new Employi("Karthi","Selvaraj",02,28,26000,true);
		Employi e3=new Employi("Isai","Selvaraj",03,26,50000,false);
		Employi e4=new Employi("Naresh","Balaji",04,25,40000,true);
		Employi e5=new Employi("Meena","Sekar",05,29,30000,false);
		HashMap<Integer,Employi>e=new HashMap<>();
		e.put(e5.getId(), e5);
		e.put(e1.getId(), e1);
		e.put(e2.getId(), e2);
		e.put(e3.getId(), e3);
		e.put(e4.getId(), e4);
		
//		e.values().forEach(x->{System.out.println(x.getName().concat(x.getFathersName()));});
		/*Iterator<Employi>iterate=e.values().iterator();
		while(iterate.hasNext()) {
			if(iterate.next().getIsMale()==false)
			iterate.remove();
		}*/int a=0;
		int c=0;
		String b="";
		for(Employi x:e.values()) {
			if(x.getName().length()%2==0) {
				a=x.getName().length()/2;
				c=a+2;
				b=x.getName().substring(a,c);
				System.out.println("Even Name: "+b);
			}
			else if(x.getName().length()%2!=0) {
				a=x.getName().length()/2;
				c=a+1;
				b=x.getName().substring(a,c);
				System.out.println("odd Name: "+b);
		}
	}
}
	
}
