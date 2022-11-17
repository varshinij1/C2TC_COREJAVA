package com.cg.polymorphism;

class Student {
	int id;
	String name;
	int age;
	Student(int i,String n) {
		id=i;
		name=n;
	}
	Student(int i,String n,int a) {
		id=i;
		name=n;
		age=a;
	}

void display() {
	System.out.println(id+" "+name+" "+age);
}
}
public class ConstructorOverLoading {

	public static void main(String[] args) {
		Student s=new Student(111,"john");
		Student s1=new Student(222,"jack",23);
		s.display();
		s1.display();

	}

}
