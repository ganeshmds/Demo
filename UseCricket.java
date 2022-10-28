package com.hashMap;

import java.util.HashMap;

public class UseCricket {
	public static void main(String [] args) {
		Cricket c1=new Cricket("Rohit",16,78,0,35,true);
		Cricket c2=new Cricket("DK",17,7,5,28,false);
		Cricket c3=new Cricket("Kohli",18,0,3,34,false);
		Cricket c4=new Cricket("Pavithran",20,67,1,29,true);
		Cricket c5=new Cricket("Msd",333,45,0,39,true);
		HashMap<Integer,Cricket>c =new HashMap<>();
		c.put(c5.getJersyNo(), c5);
		c.put(c4.getJersyNo(), c4);
		c.put(c3.getJersyNo(), c3);
		c.put(c2.getJersyNo(), c2);
		c.put(c1.getJersyNo(), c1);
		int max=0;
		Cricket d=null;
		for(Cricket x:c.values()) {
			if(x.getIsBatsman()==true && max<x.getAge()) {
				max=x.getScore();
			d=x;
			}

			/*if(x.getScore()>=max&& x.getIsBatsman()==false) {
				max=x.getScore();
				d=x;
			}*/
		}
		System.out.println(d.getName());
		System.out.println(d.getAge());
	}
	
	}


