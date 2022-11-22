package com.cg.multithraeding;

class Car extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Car thread Id is"+" "+Thread.currentThread().getId());
		}
	}
}
class Bus extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Bus thread Id is"+" "+Thread.currentThread().getId());
		}
	}
}
public class Demo {

	public static void main(String[] args) {
		Car c=new Car();
		Thread t=new Thread(c);
		t.start();
		Bus b=new Bus();
		Thread t1=new Thread(b);
		t1.start();
		
	}

}
