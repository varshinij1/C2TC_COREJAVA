package com.cg.finalkeyword;

public class Bike {
	final void run() {
		System.out.println("running");}
		
	}
	 class Honda extends Bike {
		void run() {
			System.out.println("running safely");//cannot change the value
			
		}
	

	public static void main(String[] args) {
		Honda h=new Honda();
		h.run();
		

	}

}
