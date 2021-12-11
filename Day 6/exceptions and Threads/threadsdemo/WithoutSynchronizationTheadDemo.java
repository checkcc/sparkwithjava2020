package com.demo.threadsdemo;

//Thread Synchronization
//There are two types of thread synchronization mutual exclusive and inter-thread communication.

//Mutual Exclusive
//Synchronized method.
//Synchronized block.
//Static synchronization.
//Cooperation (Inter-thread communication in java)

//resource
class SynchronizationTheadDemo {

	void show(int number) {

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

class Thread1 extends Thread {

	SynchronizationTheadDemo t1;

	Thread1(SynchronizationTheadDemo t1) {

		this.t1 = t1;
	}

	public void run() {

		t1.show(5);
	}

}

class Thread2 extends Thread {

	SynchronizationTheadDemo t1;

	Thread2(SynchronizationTheadDemo t1) {

		this.t1 = t1;
	}

	public void run() {

		t1.show(50);
	}

}

public class WithoutSynchronizationTheadDemo {

	public static void main(String ar[]) {
		
		SynchronizationTheadDemo tname = new SynchronizationTheadDemo(); //resource
		
		Thread1 thread1 = new Thread1(tname);
		
		Thread2 thread2 = new Thread2(tname);
		
		
		thread1.start();
		thread2.start();
		

	}

}
