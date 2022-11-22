package com.cg.threadpriority;

class Bus extends Thread {
	public void run() {
		System.out.println("Bus thread Id is"+" "+Thread.currentThread().getId());
		System.out.println("Bus thread priority is"+" "+Thread.currentThread().getId());
	}
}
class Car extends Thread {
	public void run() {
		System.out.println("Car thread Id is"+" "+Thread.currentThread().getId());
		System.out.println("Car thread priority is"+" "+Thread.currentThread().getId());
	}
}
public class MultiThread {

	public static void main(String[] args) {
		Bus b=new Bus();
		Thread t=new Thread(b);
		t.start();
		t.setPriority(Thread.MIN_PRIORITY);
		
		Car c=new Car();
		Thread t1=new Thread(c);
		t1.start();
		t1.setPriority(Thread.NORM_PRIORITY);
		
	}

}
