package com.demo.constructor;

class Add {
	// constructor with no parameter
	
	static {
		
		System.out.println("loading main modules or db connections");
		
	}
	
	static {
		
		System.out.println("loading secondary modules");
		
	}
	Add() {

		int i = 1;
		int j = 7;
		int c = i + j;

		System.out.println("sum of num using constructor" + c);

	}
  //method
	void add() {

		int i = 1;
		int j = 7;
		int c = i + j;

		System.out.println("sum of num from method" + c);
	}

	// with parameter
	Add(double i, double j) {
		double c = i + j;
		System.out.println("sum of num" + c);

	}

}

public class ConstructorDemo {

	public static void main(String ar[]) {

		Add add = new Add();
		Add add1 = new Add(2.5, 2.5); // passing parameter

		add.add();// method calling

	}

}
