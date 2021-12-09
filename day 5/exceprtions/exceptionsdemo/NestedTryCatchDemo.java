package com.demo.exceptionsdemo;

public class NestedTryCatchDemo {

	public static void main(String ar[]) {

		try {

			int array[] = new int[5];
			array[8] = 9;
			System.out.println(array);

			try {

				int number = 100 / 0;
				System.out.println(number);
			} catch (ArithmeticException e) {

				System.out.println(e);
			}

			// try end
		}

		catch (ArrayIndexOutOfBoundsException e) {

			e.printStackTrace();

		}

		finally {

			System.out.println("end  of line");
		}

	}

}
