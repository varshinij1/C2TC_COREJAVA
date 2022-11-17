package com.cg.inheritance;

interface  Dad {
	void snoring();
	}
interface Mom {
		void snoring();
		}
class Child implements Dad,Mom {
	public void snoring() {
		System.out.println("Yes,I do have snoring");
			
		}
	public class MultipleInheritance {
	
	public static void main(String[] args) {
		Child c=new Child();
		c.snoring();
	}
		
	}

}
