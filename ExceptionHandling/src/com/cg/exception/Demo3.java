package com.cg.exception;

public class Demo3 {

	public static void main(String[] args) {
		Object ob=new Object();
		try {
			ob.meth1();
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception thrown by meth1()");
		}

	}
public void meth1() {
	try {
		System.out.println(100/0);
	}
	catch(NullPointerException nullExp) {
		System.out.println("We have an exception"+nullExp);
		
	}
	System.out.println("outside try-catch block");
}

}
