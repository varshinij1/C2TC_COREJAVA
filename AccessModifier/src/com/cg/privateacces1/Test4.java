package com.cg.privateacces1;
//outside package
import com.cg.privateaccess.Test1;

public class Test4 {

	public static void main(String[] args) {
		Test1 t1=new Test1();
		t1.show();
		System.out.println(t1.i);
	}

}
