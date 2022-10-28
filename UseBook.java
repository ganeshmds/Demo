package com.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UseBook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book("Ponniyin Selvan","kalki",5000,1000);
		Book b2=new Book("vaanam","Simbhu",500,100);
		Book b3=new Book("Kidai","ramaswamy",400,200);
		Book b4=new Book("Artham","kannadasan",200,400);
		Book b5=new Book("HarryPotter","SewAuthor",1000,500);
		Book b6=new Book("Kalvettu","Vairamuthu",6000,600);
		ArrayList<Book>b =new ArrayList<>();
//		b.add(b6);
//		b.add(b5);
//		b.add(b4);
//		b.add(b3);
//		b.add(b2);
//		b.add(b1);
		HashMap<Integer,Book>h=new HashMap<>();
		h.put(b6.getPrice(), b6);
		h.put(b1.getPrice(), b1);
		h.put(b2.getPrice(), b2);
		h.put(b3.getPrice(), b3);
		h.put(b4.getPrice(), b4);
		h.put(b5.getPrice(), b5);
		
		Map<Integer,Book>l= h.stream().collect(Collectors.toList());
		l.forEach((a,c)->System.out.println(a));
			
		
		
//		List<Book>l= b.stream().collect(Collectors.toList());
//		l.forEach(x->System.out.println(x));
//		Map<Book,String>l=b.stream().filter(x->x.getBookname().startsWith("S")).collect(Collectors.toMap(x->x,y->y.getAuthorname()));
//			l.forEach((a,c)->System.out.println(c));
//			Map<Integer,Book>d=b.stream().filter(x->x.getPrice()>200).collect(Collectors.toMap(x->x.getPrice(),x->x));
//			d.forEach((a,c)->System.out.println(c.getBookname()));

//		List<String>l= b.stream().map(m->m.getAuthorname()).collect(Collectors.toList());
//		for(String y:l) {
//			System.out.println(y);
			Long m=b.stream().count();
				System.out.println(m);
		}
		}
	
