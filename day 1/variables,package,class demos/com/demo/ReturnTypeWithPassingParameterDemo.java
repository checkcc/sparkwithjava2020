package com.demo;


//return type demo

class SubstractionDemo2 {
	
	// passing parameter in method
	int Sub1(int number1, int number2) {

		int subresult;

		subresult = number1 - number2; // sub logic

		return subresult; //   need to  implement this

	}
}

class AdditionDemo2 {
	// passing parameter in method
	void Addtion(int number1, int number2) {

		int result;

		result = number1 + number2; // sub logic

		System.out.println(" add  of two " + result);

	}
}

public class ReturnTypeWithPassingParameterDemo {

	public static void main(String arg[]) {
		
		SubstractionDemo2 sub = new SubstractionDemo2();
		
		int resultOfSub = sub.Sub1(4, 2); // collect the resut from the substraction class
		
		System.out.println("result from main class "+resultOfSub);
	
	}

}
