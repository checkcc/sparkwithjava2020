package com.demo.java8.lambdademo;

//SAM
@FunctionalInterface // it is options
interface Addable1 {

	int add(int a, int b);

}

public class LambdaWithMutipleParametersDemo {

	public static void main(String[] args) {

		// with lambda without return type
		Addable1 add = (a, b) -> (a + b); // no return type and data type
		System.out.println(add.add(5, 2));

		// Multiple parameters with data type in lambda expression
		Addable1 add2 = (a, b) -> (a + b); //

		System.out.println(add.add(100, 300));
		

	}

}
