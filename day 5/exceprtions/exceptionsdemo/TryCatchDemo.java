package com.demo.exceptionsdemo;

public class TryCatchDemo {
	//Logger

	public static void main(String ar[]) {

		try {

			int number = 100 / 0;
			System.out.println(number);
		} catch (Exception e) {

			e.printStackTrace();

		}
	}

}
