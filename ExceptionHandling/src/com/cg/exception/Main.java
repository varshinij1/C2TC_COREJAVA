package com.cg.exception;

public class Main {

	public static void main(String[] args) {
		System.out.println("First line");
		System.out.println("second line");
		int[] myIntArray=new int[] {1,2,3};
		print(myIntArray);
		System.out.println("third line");
		

}
	public static void print(int[] arr) {
		System.out.println(arr[3]);
		System.out.println("fourth element succesfully displayed");
	}
}
