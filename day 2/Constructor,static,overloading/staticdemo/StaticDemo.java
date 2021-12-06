package com.demo.staticdemo;

class Bank {

	int k = 10;// instance variable

	Bank b2 = null;// class varible

	static int a = 20;
	// static block or static methods will communicate or deals with static members

	static {

		System.out.println(" step 1");
	}

	// non static method
	void show() {

		int k = 10;// local variable
		System.out.println(" show method");
	}

	// method with static
	static void show1() {
		System.out.println(" show1() method");
	}

}

public class StaticDemo {
	// loading first
	static {

		System.out.println(" step 0");
	}

	public static void main(String[] args) {

		// static zone

		int i = 10;
		System.out.println(" step 3 \n" + i);

		Bank b = new Bank(); // that why we need create object which consume memory
		b.show();

		Bank b1 = null; // b1 is class variable which is alway static in nature

		b1.show1();// calling without object
		System.out.println("-------------" + b1.a);

	}

}
