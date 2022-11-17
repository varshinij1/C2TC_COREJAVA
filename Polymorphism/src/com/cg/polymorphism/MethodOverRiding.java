package com.cg.polymorphism;

class Vechile {
	void run() {
		System.out.println("vechile is running");
	}
}
class Bike extends Vechile {
	void run() {
		System.out.println("Bike is running");
	}
}
public class MethodOverRiding {

	public static void main(String[] args) {
		Bike b=new Bike();
		b.run();
	}

}
