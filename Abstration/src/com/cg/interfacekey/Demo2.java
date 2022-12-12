package com.cg.interfacekey;
//default method
interface Sayable {
	default void say() {
		System.out.println("Default method");
	}
	void SayMore(String msg);
}
class DefaultMethods implements Sayable {
	public void SayMore(String msg) {
		System.out.println(msg);
	}
}
public class Demo2 {

	public static void main(String[] args) {
		DefaultMethods dm=new DefaultMethods();
		dm.say();
		dm.SayMore("Work is worship");

	}

}
