package com.cg.thiskeyword;

public class Student {
	int rollno;
	String name;
	float cgpa;
	Student(int r,String n,float f) {
		this.rollno=r;
		this.name=n;
		this.cgpa=f;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+cgpa );
	}


	public static void main(String[] args) {
		Student s1=new Student(101,"john",10.8f);
		Student s2=new Student(102,"jack",8.87f);
		s1.display();
		s2.display();
	

	}

}
