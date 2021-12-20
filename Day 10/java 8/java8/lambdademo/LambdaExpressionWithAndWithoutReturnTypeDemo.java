package com.demo.java8.lambdademo;

//SAM
@FunctionalInterface // it is options
interface Addable {

	int add(int a, int b);

}

public class LambdaExpressionWithAndWithoutReturnTypeDemo {

	public static void main(String[] args) {

		// with lambda without return type
		Addable add = (a, b) -> (a + b); // no return type
		System.out.println(add.add(5, 2));

		// with lambda with return type
		Addable add1 = (a, b) -> {
			return (a + b); // using return keyword
		};
		System.out.println(add.add(100, 300));

	}

}
