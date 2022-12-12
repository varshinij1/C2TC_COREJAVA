package com.cg.interfacekey;

interface Vehicle {
	String Color="Blue";
	void run(); 
}
class Bike implements Vehicle {
	public void run() {
		System.out.println("Running");
		System.out.println(Color);
	}
}
public class Demo {

	public static void main(String[] args) {
	Bike b=new Bike();
	b.run();

	}

}
