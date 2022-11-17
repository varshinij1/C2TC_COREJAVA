package com.cg.polymorphism;

class Adder1 {
	static int add(int a,int b) {
		return a+b;
	}
	static double add(int a,int b) {
		return a+b;
	}
}
public class TestOverLoading2 {

	public static void main(String[] args) {
	System.out.println(Adder1.add(11, 11));	
	}

}
