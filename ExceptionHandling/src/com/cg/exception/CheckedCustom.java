package com.cg.exception;

import java.util.Scanner;

public class CheckedCustom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		try {
			customername(name);
			} 
		catch(Exception e) {
			System.out.println(e);
		}
	}
	static void customername(String name)throws NamenotFoundException {
	if(name.isEmpty()) {
		throw new Exception("Name id empty");
	}
	else {
		System.out.println("hi"+name+""+"welcome");
	}
	}

}
