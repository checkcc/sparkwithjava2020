package com.demo.collectiondemo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*  
 * Java HashSet class is used to create a collection 
 * that uses a hash table for storage. It inherits the AbstractSet class and implements Set interface.

The important points about Java HashSet class are:

HashSet stores the elements by using a mechanism called hashing.
HashSet contains unique elements only.
HashSet allows null value.
HashSet class is non synchronized.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
HashSet is the best approach for search operations.
The initial default capacity of HashSet is 16, and the load factor is 0.75.  java  1.1  synchronized.
 * 
 * 
 * */

public class SetDemo {
	
	public static void main(String ar[]) {
		
		Set<String> setdemo = new HashSet<String>();
		
		setdemo.add("apple");
		setdemo.add("mango");
		setdemo.add("banana");
		setdemo.add("nuts");
		setdemo.add("apple");
		setdemo.add("apple");
		setdemo.add("apple");
		setdemo.add("apple");
		
	//	Collections.synchronizedSet(setdemo);///explicity
		
		setdemo.add(null);
		setdemo.add(null);
		
		setdemo.add(null);
		
		
		
		
		
		Iterator iterator = setdemo.iterator();

		if (iterator != null) {

			while (iterator.hasNext()) {

				System.out.println(iterator.next());

			}

		}
		
	}

}
