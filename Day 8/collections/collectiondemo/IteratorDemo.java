package com.demo.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String ar[]) {
		// Array:List demo
		ArrayList<String> arraylistdemo = new ArrayList<String>();

		arraylistdemo.add("apple");
		arraylistdemo.add("Mango");
		arraylistdemo.add("banana");
		arraylistdemo.add("Nuts");

		Iterator iterator = arraylistdemo.iterator();

		if (iterator != null) {

			while (iterator.hasNext()) {

				System.out.println(iterator.next());

			}

		}

	}

}
