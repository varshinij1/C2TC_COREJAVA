package com.cg.interfacekey;
//interface-static method
interface Animal {
	int a=10;
	static void display() {
		System.out.println("Static method");
	}
}
class Dog implements Animal {
	
}
public class Demo1 {

	public static void main(String[] args) {
		Animal.display();
		
		
	}

}
