package com.hashMap;

import java.util.HashMap;

public class Lms {
	public static void main(String[] args) {
		HashMap<Integer,String>lmsList=new HashMap<>();
		lmsList.put(1,"Pavithran");
		lmsList.put(2,"Bharathi");
		lmsList.put(3,"Bharani");
		lmsList.put(5,"Mani");
		lmsList.put(4,"Pavi");
		System.out.println(lmsList);
		System.out.println(lmsList.get(4));
		System.out.println(lmsList.keySet());
		System.out.println(lmsList.values());
	}

}
