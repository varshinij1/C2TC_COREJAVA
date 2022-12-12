package com.cg.interfacekey;

interface Animal {
	void eat();
}
interface Vechile {
	void run();
}
class KTM implements Animal,Vechile {
	public void eat() {
		System.out.println("Eating");
	}
	public void run() {
		System.out.println("Running");
	}
}
public class Demo4 {

	public static void main(String[] args) {
		KTM k=new KTM();
		k.eat();
		k.run();
	}

}
