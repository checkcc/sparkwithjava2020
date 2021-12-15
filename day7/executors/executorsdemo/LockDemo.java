package com.demo.executorsdemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class PrintDemo {

	private final Lock lock = new ReentrantLock();
	//            Lock = new ReentrantLock();

	public void print() {

		lock.lock();

		try {

			Long duration = (long) (Math.random() * 10000);
			System.out.println(Thread.currentThread().getName() + " time taken --> " + (duration / 1000) + "--> seconds");
			Thread.sleep(duration);
		} catch (Exception e) {

			e.printStackTrace();
		}

		finally {

			System.out.println("%s  printed the document sucessfully \n" + Thread.currentThread().getName());
			lock.unlock();
			System.out.println("lock released");
			
		}

	}

}

class ThreadDemo extends Thread {

	PrintDemo printDemo;

	// constructor
	ThreadDemo(String name, PrintDemo printDemo) {
		super(name);// calling the super class thread name here
		this.printDemo = printDemo;

	}

	public void run() {

		System.out.println("%s  started the document \n" + Thread.currentThread().getName());

		printDemo.print();

	}

}

public class LockDemo {

	public static void main(String ar[]) {

		PrintDemo printdemo = new PrintDemo();

		ThreadDemo t1 = new ThreadDemo(" thread 1", printdemo);
		ThreadDemo t2 = new ThreadDemo(" thread 2", printdemo);
		ThreadDemo t3 = new ThreadDemo(" thread 3", printdemo);
		ThreadDemo t4 = new ThreadDemo(" thread 4", printdemo);

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
