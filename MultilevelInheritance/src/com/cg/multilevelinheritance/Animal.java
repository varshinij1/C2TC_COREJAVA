package com.cg.multilevelinheritance;

public class Animal {
	void eat() {
		System.out.println("eating...");
	}
	static class Dog extends Animal {
		void bark() {
			System.out.println("barking....");
		}
	}
	static class BabyDog extends Dog {
		void weep() {
			System.out.println("weeping...");
		}
	}

	public static void main(String[] args) {
		BabyDog bd=new BabyDog();
		bd.eat();
		bd.bark();
		bd.weep();
		
	}

}
