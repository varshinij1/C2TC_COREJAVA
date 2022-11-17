package com.cg.interfacekeyword;
//interface-multiple inheritance
interface Inf1 {
	public void myMethod();
}
interface Inf2 {
	public void myMethod();
}
public class Main2  implements Inf1,Inf2 {
	public void myMethod() {
		System.out.println("Implementing more than one interface");
	}

	public static void main(String[] args) {
		Main2 m=new Main2();
		m.myMethod();
		

	}

}
