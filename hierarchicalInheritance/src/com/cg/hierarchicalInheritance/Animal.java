package com.cg.hierarchicalInheritance;

public class Animal {
	void eat() {
		System.out.println("eating..");
	}
	class Dog extends Animal {
		void bark() {
			System.out.println("barking...");
		}
	}
 static class Cat extends Animal {
	void meow() {
		System.out.println("meowing...");
	}
}
	public static void main(String[] args) {
		Cat c=new Cat();
		c.eat();
		c.meow();
		//c.bark(); error
		
	}

}
