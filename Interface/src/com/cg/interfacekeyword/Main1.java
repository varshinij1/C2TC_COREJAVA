package com.cg.interfacekeyword;
//interface-static method
interface In1 {
	int a=10;
	static void display() {
		System.out.println("static method");
		
	}
}
public class Main1  implements In1{

	public static void main(String[] args) {
		In1.display();
		
	}

}
