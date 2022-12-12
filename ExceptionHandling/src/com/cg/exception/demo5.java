package com.cg.exception;


public class demo5 {
	public static void validate(int age) {
		if(age<21 || age>27)
			throw new ArithmeticException("Not eligible");
		else 
			System.out.println("Eligible to attend");
	}

	public static void main(String[] args) {
     
     try {
    	 validate(30);
     }
     catch(ArithmeticException e) {
    	 System.out.println(e);
     }
     System.out.println("rest of the code.......");

	}

}
