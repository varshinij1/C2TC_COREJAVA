package com.cg.multithraeding;

class Van implements Runnable {
	public void run() {
		for(int i=0;i<3;i++) {
		System.out.println("van thread Id is"+" "+Thread.currentThread().getId());
	}
}
}
class Bike implements Runnable {
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("Bike thread Id is"+" "+Thread.currentThread().getId());
		}
	}
}
public class Demo1 {

	public static void main(String[] args) {
		Van b=new Van();
		Thread t=new Thread(b);
		t.start();
		Bike c=new Bike();
		Thread t1=new Thread(c);
		t1.start();
		
	}

}
