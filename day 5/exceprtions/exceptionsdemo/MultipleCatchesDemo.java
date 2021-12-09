package com.demo.exceptionsdemo;

import java.io.IOException;
import java.sql.SQLException;

public class MultipleCatchesDemo {
	// Logger

	public static void main(String ar[]) {

		try {

			int array[] = new int[5];
			array[8] = 9;
			System.out.println(array);
		}

		catch (ArrayIndexOutOfBoundsException e) {

			e.printStackTrace();

		}

		catch (ArithmeticException e) {

			e.printStackTrace();

		}

		catch (Exception e) {

			e.printStackTrace();

		}

	}
}