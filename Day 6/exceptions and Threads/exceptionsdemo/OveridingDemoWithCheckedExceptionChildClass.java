package com.demo.exceptionsdemo;

import java.io.IOException;

class Parent {
	void show() {
		System.out.println(" from parent method");
	}
}

class ChildException extends Parent {
	// overriding the method in child class
	// gives compile time error

	void show() throws NullPointerException { // this is my unchecked exception catagory   void show() throws IOException 
		System.out.println(" from child method");
	}
}

public class OveridingDemoWithCheckedExceptionChildClass {
	public static void main(String ar[]) {
		Parent p = new ChildException();
		p.show();

	}
}
