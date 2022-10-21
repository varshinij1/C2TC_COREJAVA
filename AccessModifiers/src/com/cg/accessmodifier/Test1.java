package com.cg.accessmodifier;

public class Test1 {
	
	public int i;
	 public void display() {
		System.out.println("in display method");
	}
	public static void main (String[] args) {
		Test1 t1=new Test1();
		t1.i=10;
		t1.display();
	}

}
