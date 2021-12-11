package com.demo.threadsdemo;

class NamingThreadDemo extends Thread {


	// write logic here
	public void run() {
		System.out.println("running..");

	}

}

public class NamingMainThreadDemo {
	public static void main(String ar[]) {

		NamingThreadDemo t1 = new NamingThreadDemo();

		t1.start();
		t1.setName("MyThread-Raj");

		NamingThreadDemo t2 = new NamingThreadDemo();
		t2.start();
		
		t2.setName("MyThread-Raj2");

		System.out.println("get the name of thread" + t1.getName());
		System.out.println("get the name of thread" + t2.getName());
		t1.setPriority(7);
		t1.getId();
		//join write a program for this
		//daemon thread write a program for this
		

	}

}
