package com.cg.abstraction;

abstract class Animal {
	abstract void eat(); 
}
class Dog extends Animal {

	void eat() {
		System.out.println("Eating");
		
	
}
}
public class Demo {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
	}

}
