package com.cg.superkeyword;
// super can be used to invoke immediate parent class method
public class Vechile {
	void gear() {
		System.out.println("breaking..");
	}
static	class Ktm extends Vechile {
		void gear() {
			System.out.println("breaking car...");
		}
		void crash () {
			System.out.println("crashing...");
		}
		void start() {
			super.gear();
			crash();
			gear();
		}
	}

	public static void main(String[] args) {
		Ktm k=new Ktm();
		k.start();
		
	}

}
