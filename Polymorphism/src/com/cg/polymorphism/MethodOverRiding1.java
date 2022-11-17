package com.cg.polymorphism;

import com.cg.polymorphism.Bank.HDFC;

class Bank {
	void RateOfInterst () {
		System.out.println("ROI is 1");
	}
	class SBI extends Bank {
		void RateOfIntrest() {
			System.out.println("ROI is 2");
		}
	}
	class HDFC extends Bank {
		void RateOfIntrest () {
			System.out.println("ROI is 3");
		}
	}
}
public class MethodOverRiding1 {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		
		

	}

}
