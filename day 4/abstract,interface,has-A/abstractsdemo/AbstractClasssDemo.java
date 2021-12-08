package com.demo.abstractsdemo;

abstract class Abc {

	Abc() {
	} // constructor

	abstract void show();

	// non abstract method
	void show1() {
	}
  /// static method too
	static void show2() {
	}

	// static void show4();

}

class Xyz extends Abc {

	void show() {

		System.out.println(" my xyx version");
	}

}



public class AbstractClasssDemo {

	public static void main(String ar[]) {
		
		Xyz x = new Xyz();
		x.show();
		
		
		Abc s = new Xyz();
		
		s.show();

	}

}
