package com.cg.polymorphism;
 
//method overloading changing no of arguments

class Adder {
	static int add(int a,int b) {
		return a+b;
		
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}
}
public class TestOverloading {

	public static void main(String[] args) {
		System.out.println(Adder.add(2, 3));
		System.out.println(Adder.add(2, 3,4));
		

	}

}
