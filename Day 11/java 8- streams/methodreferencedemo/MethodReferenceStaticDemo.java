package com.demo.java8.methodreferencedemo;

import java.util.function.BiFunction;

class AddDemo {

	public static int add(int a, int b) {
		return a + b;
	}
}

public class MethodReferenceStaticDemo {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> adder1 = AddDemo::add; // use of inbuilt functional interface with default
																		// method
		int result = adder1.apply(10, 20);
		System.out.println("------------------>"+result);
		
	
	}

}
