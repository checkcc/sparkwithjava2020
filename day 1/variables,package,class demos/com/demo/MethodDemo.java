package com.demo;
// xyz 2040

class SubstractionDemo {

	void Sub() {

		int number1 = 20;
		int number2 = 10;
		int subresult;

		subresult = number1 - number2; // sub logic

		System.out.println(" sub  of two " + subresult);

	}
}

public class MethodDemo {

	public static void main(String arg[]) {

		SubstractionDemo substraction = new SubstractionDemo();

		substraction.Sub(); // calling from here

	}

}
