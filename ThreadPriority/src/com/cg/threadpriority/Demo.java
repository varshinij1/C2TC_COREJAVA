package com.cg.threadpriority;

class counter {
	int count;
	public synchronized void increment() {
		count++;
	}
}

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		counter c=new counter();
		Thread t=new Thread(new Runnable() {
			public void run() {
				c.increment();
				
			}
			
		});
		t.start();
		t.join();
		Thread t1=new Thread(new Runnable() {
			public void run() {
				c.increment();
			}
		});
		t1.start();
		t1.join();
		System.out.println(c.count);
		

	}

}
