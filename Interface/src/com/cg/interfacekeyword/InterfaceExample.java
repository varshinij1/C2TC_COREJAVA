package com.cg.interfacekeyword;

interface Bike {
	void getMileage();
}
class R15 implements Bike {
	public void getMileage() {
		System.out.println("Mileage is 60km/L");
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		R15 r=new R15();
		r.getMileage();
	
		

	}

}
