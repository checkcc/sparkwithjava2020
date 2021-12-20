package com.demo.java8.lambdademo;

//SAM
@FunctionalInterface // it is options
interface Sayable {

	public String say();

}

public class LambdaWithNoParameterDemo {

	public static void main(String[] args) {

		Sayable s = () -> {
			return "hi how are you";
		};
		System.out.println(s.say());
	}

}
