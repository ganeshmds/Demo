package com.hashMap;

import java.util.HashMap;

import java.util.Iterator;

public class UseStudent {
	public static void main(String[] args) {
		Studentt s1=new Studentt("Ganesh",25,16,true,'C');
		Studentt s2=new Studentt("Pavi",25,17,false,'D');
		Studentt s3=new Studentt("Sahi",25,18,false,'E');
		Studentt s4=new Studentt("Isai",25,19,true,'A');
		Studentt s5=new Studentt("Sharathi",25,20,false,'A');
		
		HashMap<Integer,Studentt> slist=new HashMap<>();
		slist.put(s1.getRollNo(), s1);
		slist.put(s2.getRollNo(), s2);
		slist.put(s3.getRollNo(), s3);
		slist.put(s4.getRollNo(), s4);
		slist.put(s5.getRollNo(), s5);
//		for(Studentt x:slist.values()) {
//			if(x.getGrade()=='A') {
//		System.out.println(x.getName()+": "+x.getGrade()+" Grade");
//		}
		
//	}/
		Iterator<Studentt>s=slist.values().iterator();
		while(s.hasNext()) {
			if(s.next().getName().startsWith("S"))
			s.remove();
		}
		System.out.println(slist);
}
}