package com.cg.superkeyword;
//super can be used to invoke immediate parent class constructor
public class Dad {
	Dad() {
		System.out.println("Dad is invoked");
	}
}
	class Child extends Dad {
		Child() {
			super();
			//System.out.println("child is invoke");
		
		}
		
	


	public static void main(String[] args) {
		Child c=new Child();

}
	}
