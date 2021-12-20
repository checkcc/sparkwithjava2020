package com.demo.collectiondemo;

import java.util.ArrayList;

public class ArrayListStringDemo {

	public static void main(String ar[]) {
		// Array:List demo
		ArrayList<String> arraylistdemo = new ArrayList<String>();

		arraylistdemo.add("apple");
		arraylistdemo.add("Mango");
		arraylistdemo.add("banana");
		arraylistdemo.add("Nuts");

		if (arraylistdemo != null) {

			System.out.println("size  of array list"+arraylistdemo.size());
			System.out.println("\n");
			System.out.println(arraylistdemo);
		}

	}

}
