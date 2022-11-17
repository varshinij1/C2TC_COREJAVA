package com.cg.interfacekeyword;
//interface-default method
interface Sayable {
	default void say() {
		System.out.println("hello this is default method");
	}
	void sayMore(String msg);
}
public class DefaultMethods implements Sayable {
	public void sayMore(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		DefaultMethods dm=new DefaultMethods();
		dm.say();
		dm.sayMore("Work is done");
		

	}

}
