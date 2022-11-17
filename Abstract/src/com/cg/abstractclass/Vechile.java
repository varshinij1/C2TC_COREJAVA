package com.cg.abstractclass;

 abstract class Vechile {
	 Vechile () {
		 System.out.println("Vechile is created");
	 }
	 abstract void run();
	 void changeGear () {
		 System.out.println("gear changed");
	 }
	static class Honda extends Vechile {
		 void run () {
			 System.out.println("Running safely");
		 }
	 }

	public static void main(String[] args) {
		Honda h=new Honda();
		h.run();
		h.changeGear();
		

	}

}
