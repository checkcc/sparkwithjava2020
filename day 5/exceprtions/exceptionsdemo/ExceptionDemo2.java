package com.demo.exceptionsdemo;

public class ExceptionDemo2 {
	// Logger

	public static void main(String ar[]) {

		try {

			int array[] = new int[5];
			array[8] = 9;
			System.out.println(array);
		} catch (Exception e) {

			e.printStackTrace();

		}
	}
}