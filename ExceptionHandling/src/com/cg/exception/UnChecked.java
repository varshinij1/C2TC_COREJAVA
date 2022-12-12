package com.cg.exception;

public class UnChecked {

	public static void main(String[] args) {
		//int[] arr=new int[] {1,2,3,4,5};
		//System.out.println(arr[5]);
		System.out.println("first line");
		System.out.println("second line");
		try {
			int[] arr=new int[] {1,2,3};
			print(arr);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The array does not have 3rd element"+e);
			
		}
		System.out.println("third line");

	}
	public static void print(int[] arr) {
		System.out.println(arr[3]);
	}

}
