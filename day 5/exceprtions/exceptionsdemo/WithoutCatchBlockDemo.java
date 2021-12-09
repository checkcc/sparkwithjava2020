package com.demo.exceptionsdemo;

public class WithoutCatchBlockDemo {

	public static void main(String[] args) {
	
		
		try {

			int array[] = new int[5];
			array[8] = 9;
			System.out.println(array);
		}
		
		
		finally {
			System.out.println(" end of line..");
		}

	}

}
