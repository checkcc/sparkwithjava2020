package com.demo.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ForEachLoopDemp {

	public static void main(String ar[]) {
		// Array:List demo
		ArrayList<String> arraylistdemo = new ArrayList<String>();

		arraylistdemo.add("apple");
		arraylistdemo.add("Mango");
		arraylistdemo.add("banana");
		arraylistdemo.add("Nuts");
		
		arraylistdemo.remove(2);

		for (String fruits : arraylistdemo) {

			System.out.println("list of fruit  " + fruits);
		}

	}

}
