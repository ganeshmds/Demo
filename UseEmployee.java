package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee("Sundhar"," Developer",35000,true); 
		Employee e2=new Employee("Bharathi"," Developer",15000,true); 
		Employee e3=new Employee("Nikitha"," Executive",25000,false); 
		Employee e4=new Employee("Isai"," Artist",95000,false); 
		Employee e5=new Employee("Selva Giftlin"," Medicoder",25000,false); 
		
		ArrayList <Employee> e=new ArrayList<>();
		e.add(e5);
		e.add(e4);
		e.add(e3);
		e.add(e2);
		e.add(e1);

//	List<Employee>l= e.stream().filter(x->x.getSalary()>20000).collect(Collectors.toList());
//		List<Employee> l=e.stream().filter(x->x.getIsMale()==false).collect(Collectors.toList());
//		List<Employee>l=e.stream().filter(x->x.getName().endsWith("i")).collect(Collectors.toList());/
		List<Employee>l=e.stream().filter(x->x.getName().length()>7).collect(Collectors.toList());
	 for(Employee y:l) {
//		if( y.getName().startsWith("B")) {
		System.out.println(y);
	}}
}
