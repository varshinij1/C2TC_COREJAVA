package com.cg.polymorphism;
//changing datatype of arguments
class Adder {
	static int add(int a,int b) {
		return a+b;
	}
	static double add(double a,double b) {
		return a+b;
	}
}
public class TestOverLoading1 {

	public static void main(String[] args) {
		System.out.println(Adder.add(1, 1));
		System.out.println(Adder.add(0, 1));
		
	}

}
