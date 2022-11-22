package com.cg.multithraeding;
//by implementing runnable interface
class Eclipse implements Runnable {
	public void run() {
		System.out.println("Eclipse thread ID is"+" "+Thread.currentThread().getId());
	}
}
class PPt implements Runnable {
	public void run() {
		System.out.println("PPt thread ID is"+" "+Thread.currentThread().getId());
	}
	
}
public class Multi_Thread {

	public static void main(String[] args) {
		Eclipse e=new Eclipse();
		Thread t=new Thread(e);
		t.start();
		PPt p1=new PPt();
		Thread t1=new Thread();
		t1.start();
		
	}

}
