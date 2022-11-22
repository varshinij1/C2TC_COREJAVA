package com.cg.multithraeding;
//by extending Thread class
class Eclipse extends Thread {
	public void run() {
		System.out.println("Eclipse thread ID is"+" "+Thread.currentThread().getId());
	}
}
class PPT extends Thread {
	public void run() {
		System.out.println("PPt thread ID is"+" "+Thread.currentThread().getId());
	}
}
public class MultiThread {

	public static void main(String[] args) {
		Eclipse e=new Eclipse();
		Thread t=new Thread(e);
		t.start();
		PPT p=new PPT();
		Thread t1=new Thread(p);
		t1.start();
		
	}

}
