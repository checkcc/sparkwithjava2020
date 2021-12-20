package com.demo.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class SortDemoOnArrayList {

	public static void main(String ar[]) {
		// Array:List demo
		ArrayList<String> arraylistdemo = new ArrayList<String>();

		arraylistdemo.add("Mango");
		arraylistdemo.add("Banana");
		arraylistdemo.add("nuts");
		arraylistdemo.add("Kiwi");
		arraylistdemo.add("Orange");
		arraylistdemo.add("apple");

		Collections.sort(arraylistdemo,String.CASE_INSENSITIVE_ORDER);

		for(String fruits : arraylistdemo) {
		System.out.println("list of fruit  " + fruits);
		}

	}

}
