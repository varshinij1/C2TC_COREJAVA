package com.cg.interfacekey;

interface writable{
	void writes();
}
interface readable {
	void reads();
}
class Student implements writable,readable {
	public void writes() {
		System.out.println("writing");
	}
public	void reads() {
		System.out.println("reading");
	}
}
public class Demo3 {

	public static void main(String[] args) {
		Student s=new Student();
		s.reads();
		s.writes();

	}

}
