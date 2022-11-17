package com.cg.abstractclass;
//abstract class having abstract method
abstract class Bike { 
	abstract void run();
	
 static class Honda extends Bike {
	void run() {
		System.out.println("running safetly");
	}
}

	public static void main(String[] args) {
		Honda h=new Honda();
		h.run();
		
	}

}
