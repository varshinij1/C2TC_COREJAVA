package com.cg.abstractclass;

abstract class Bank {
	abstract int rateOfIntrest();
}
class SBI extends Bank {
	int rateOfIntrest () {
		return 7;
		
	}
}
class HDFC extends Bank {
	int rateOfIntrest () {
		return 8;
	}

	public static void main(String[] args) {
		SBI s=new SBI();
		HDFC h=new HDFC();
	
		System.out.println("The rate of intrest in SBI"+s.rateOfIntrest());
		System.out.println("The rate of intrest in HDFC"+h.rateOfIntrest());
		

	}

}
