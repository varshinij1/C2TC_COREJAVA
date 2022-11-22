package com.cg.threadpriority;

class Eclipse extends Thread {
	public void run() {
		for(int i=0;i<6;i++) {
			System.out.println("Eclipse thread Id is"+ Thread.currentThread().getId());
			try {
				sleep(5000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
public class Sleep {

	public static void main(String[] args) {
		Eclipse e=new Eclipse();
		e.start();
		
	}

}
