package com.demo.collectiondemo;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
	
	/* 
	 * The important points about Java LinkedList are:

	Java LinkedList class can contain duplicate elements.
	Java LinkedList class maintains insertion order.
	Java LinkedList class is non synchronized.
	In Java LinkedList class, manipulation is fast because no shifting needs to occur.
	Java LinkedList class can be used as a list, stack or queue.
	 * 
	 */

	public static void main(String ar[]) {
	
		LinkedList<String> linklistdemo = new LinkedList<String>();

		linklistdemo.add("Mango");
		linklistdemo.add("Banana");
		linklistdemo.add("nuts");
		linklistdemo.add("Kiwi");
		linklistdemo.add("Orange");
		linklistdemo.add("apple");
		
		linklistdemo.addFirst("NewFRuit");
		
		linklistdemo.addLast("lastToAdd");

	//	Collections.sort(linklistdemo, String.CASE_INSENSITIVE_ORDER);

		for (String fruits : linklistdemo) {
			System.out.println("list of fruit  " + fruits);
		}

	}

}
