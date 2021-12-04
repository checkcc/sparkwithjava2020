package com.demo;

// without any return type

class SubstractionDemo1 {
	// passing parameter in method
	void Sub1(int number1, int number2) {

		int subresult;

		subresult = number1 - number2; // sub logic

		System.out.println(" sub  of two " + subresult);

	}
}

class AdditionDemo1 {
	// passing parameter in method
	void Addtion(int number1, int number2) {

		int result;

		result = number1 + number2; // sub logic

		System.out.println(" add  of two " + result);

	}
}

public class PassingParameteInMethodDemo {

	public static void main(String arg[]) {

		SubstractionDemo1 substraction = new SubstractionDemo1(); // object created

		substraction.Sub1(20, 10); // calling from here

		AdditionDemo1 addition = new AdditionDemo1();
		
		addition.Addtion(15, 15);

	}

}
