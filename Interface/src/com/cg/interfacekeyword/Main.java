package com.cg.interfacekeyword;

interface Bank {
	float rateOfIntrest();
}
class SBI implements Bank {
	public float rateOfIntrest() {                          //interface to interface use extends keyword
		                                                    //interface to class use implements keyword
		return 9.16f;
	}
}
class HDFC implements Bank {
	public float rateOfIntrest() {
		return 3.13f;
	}
}
public class Main {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		h.rateOfIntrest();
		SBI b=new SBI();
		b.rateOfIntrest();
		System.out.println("SBI rate of intrest"+" "+b.rateOfIntrest());
		System.out.println("rateOfIntrest is"+h.rateOfIntrest());
		
	}

}
