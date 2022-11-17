package com.cg.interfacekeyword;

interface i1 {
	public void myMethod();
}
interface i2 {
	public void myMethod1();
	
}
class i3 implements i1,i2 {
	public void myMethod() {
		System.out.println("myMethod");
	}
	public void myMethod1() {
		System.out.println("myMethod1");
	}
}
public class Main3 {

	public static void main(String[] args) {
		i3 i=new i3();
		i.myMethod();
		i.myMethod1();
		
	}

}
