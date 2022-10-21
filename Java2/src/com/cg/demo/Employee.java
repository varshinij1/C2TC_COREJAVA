package com.cg.demo;

public class Employee {
	int id;
	String name;
	float salary;
	public void display() {
		System.out.println(id+" "+name+" "+salary);
	}
	 public Employee(int i,String n,float s) {
		id=i;
		name=n;
		salary=s;
		
	}
}

