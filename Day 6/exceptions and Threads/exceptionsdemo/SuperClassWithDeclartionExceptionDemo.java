package com.demo.exceptionsdemo;


class Parent1 {
	void show() throws ArithmeticException{       //sub class of exception
		System.out.println(" from parent method");
	}
}

class ChildException1 extends Parent {
	// overriding the method in child class
	// gives compile time error

	void show()  {     ///super class   	void show() throws Exception
		System.out.println(" from child method");
	}
}




public class SuperClassWithDeclartionExceptionDemo {

	public static void main(String[] args) {

		
		// your calling from here

	}

}
