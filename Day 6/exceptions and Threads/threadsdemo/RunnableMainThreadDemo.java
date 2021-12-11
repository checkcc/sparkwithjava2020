package com.demo.threadsdemo;



class RunnableThreadDemo implements Runnable {
	Thread t;
	String ThreadName;

	// constructor
	RunnableThreadDemo(String name) {
		ThreadName = name;
		 System.out.println("Creating " +  name );
	}

	// write logic here
	public void run() {
		try {
			for (int i = 8; i > 0; i--) {
				System.out.println("thread " + ThreadName + " ," + i);
				Thread.sleep(7000); //

			}

		} catch (InterruptedException e) {
			System.out.println("thread " + ThreadName + " has been Interrupted");

		}

		System.out.println("thread " + ThreadName + " has been Interrupted");

	}

	public void start() {
		System.out.println("thread  is starting..." + ThreadName);
		if (t == null) {

			t = new Thread(this, ThreadName);
			t.start();

		}

	}

}

public class RunnableMainThreadDemo {
	public static void main(String ar[]) {

		RunnableThreadDemo t1 = new RunnableThreadDemo("thread 1");
		t1.start();
		
		RunnableThreadDemo t2 = new RunnableThreadDemo("thread 2");
		t2.start();


	}

}
