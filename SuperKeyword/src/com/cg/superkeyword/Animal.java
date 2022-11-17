package com.cg.superkeyword;
// super can be used to refer immediate parent class instance varible
 class Animal {
	String color="white";
 
static class Dog extends Animal {
	String color="black";
	void printcolor() {
		System.out.println(color);
		System.out.println(super.color);//parent class output
	}
	
}
 


	public static void main(String[] args) {
		Dog d=new Dog();
		d.printcolor();
		
		
	}
 }


