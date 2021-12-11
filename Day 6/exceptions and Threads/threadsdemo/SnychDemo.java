package com.demo.threadsdemo;

//resource
class SynchTheadDemo {

	synchronized void show(int number) {

		for (int i = 1; i < 6; i++) {
			
			System.out.println(number*i);

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread3 extends Thread {

	SynchTheadDemo t1;

	Thread3(SynchTheadDemo t1) {

		this.t1 = t1;
	}

	public void run() {

		t1.show(5);
	}

}

class Thread4 extends Thread {

	SynchTheadDemo t1;

	Thread4(SynchTheadDemo t1) {

		this.t1 = t1;
	}

	public void run() {

		t1.show(50);
	}

}

public class SnychDemo {

	public static void main(String ar[]) {
		
		SynchTheadDemo tname = new SynchTheadDemo(); //resource
		
		Thread3 thread1 = new Thread3(tname);
		
		Thread4 thread2 = new Thread4(tname);
		
		
		thread1.start();
		thread2.start();
		

	}

}
