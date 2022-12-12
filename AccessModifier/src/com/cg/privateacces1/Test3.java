package com.cg.privateacces1;
//outside package by subclass only
import com.cg.privateaccess.Test1;

public class Test3 extends Test1{

	public static void main(String[] args) {
		Test3 t3=new Test3();
		t3.show();
		System.out.println(t3.i);
		
	}

}
