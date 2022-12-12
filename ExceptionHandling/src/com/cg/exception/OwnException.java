package com.cg.exception;

class InvalidAgeException extends Exception {
	InvalidAgeException(String s) {
		System.out.println(s);
	}
}


public class OwnException {
	static void validate(int age)throws InvalidAgeException {
		if(age<18)
			throw new InvalidAgeException("Invalid Input");
		else
			System.out.println("right to vote");
	}

	public static void main(String[] args) {
		try {
			validate(14);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of the code......");
	}

}
