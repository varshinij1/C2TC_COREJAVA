package com.cg.thiskeyword;

public class Demo1 {
	Demo1 () {
		System.out.println("hello a");
	}
	Demo1(int x) {
		this();
		System.out.println(x);
	}

	public static void main(String[] args) {
		Demo1 d1=new Demo1(10);
	}

}
