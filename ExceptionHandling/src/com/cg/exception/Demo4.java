package com.cg.exception;

public class Demo4 {

	public static void main(String[] args) {
		String[] s= {"Hello","423",null,"Hi"};
		for(int i=0;i<5;i++) {
			try {
				int a=s[i].length()+Integer.parseInt(s[i]);
				System.out.println(a);
			}
			catch(NumberFormatException ex) {
				System.out.println("NumberFormatException"+ex);
			}
			System.out.println("Continue....");
		}

	}

}
