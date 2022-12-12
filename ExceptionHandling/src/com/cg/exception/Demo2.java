package com.cg.exception;

import java.io.FileInputStream;

class Class {
	public void checkFileNotFound() {
		try {
			FileInputStream in=new FileInputStream("input.txt");
			System.out.println("This is not printed");
		}
		catch(Exception fileNotFoundException ) {
			System.out.println(fileNotFoundException+" file not found exception");
			
		}
	}
}
public class Demo2 {

	public static void main(String[] args) {
		Class ex=new Class();
		ex.checkFileNotFound();
		

	}

}
