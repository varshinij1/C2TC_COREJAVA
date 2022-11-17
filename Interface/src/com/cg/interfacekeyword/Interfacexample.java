package com.cg.interfacekeyword;

interface Vechile {
	void run();
}
interface Bike extends Vechile {
	void gear();
}
 class R15 implements Bike {
	public void run() {
		System.out.println("running");
	}
	public void gear() {
		System.out.println("gear is applied");
	}
 }	

public class Interfacexample {

	public static void main(String[] args) {
		R15 r=new R15();
		r.gear();
		r.run();
		
	}

}
