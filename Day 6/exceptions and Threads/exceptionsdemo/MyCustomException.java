package com.demo.exceptionsdemo;

class MyException extends Exception {

	MyException(String s) {

		super(s); // calling the consturctor of parent class esxception
	}
}

public class MyCustomException {

	public static void main(String ar[]) {

		try {
                       //   new A("demo")
			throw new MyException(" this is my own exception");// creating an object for the message
		
		} catch (MyException e) {

		//	e.printStackTrace();
			System.out.println("caught");

		}

	}

}
