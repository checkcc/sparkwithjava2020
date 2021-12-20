package com.demo.java8.lambdademo;
  //SAM
@FunctionalInterface //it is options
interface Drawables {

	public void draw();

}

public class LambdaExpressionWithLambda {

	public static void main(String[] args) {

		int width = 10;
          //with lambda
		Drawables d = () -> {System.out.println("drawing usign lambdha  " + width);};
		d.draw();

	}

}
