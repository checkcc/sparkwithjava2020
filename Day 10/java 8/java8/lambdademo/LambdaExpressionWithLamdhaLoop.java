package com.demo.java8.lambdademo;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionWithLamdhaLoop {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("ram1");
		list.add("ram2");
		list.add("ram3");
		list.forEach((n) -> System.out.println(n));
	}
}
