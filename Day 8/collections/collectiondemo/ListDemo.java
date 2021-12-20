package com.demo.collectiondemo;

import java.util.ArrayList;
import java.util.List;


//Java ArrayList class can contain duplicate elements.
//Java ArrayList class maintains insertion order.
//Java ArrayList class is non synchronized.
//Java ArrayList allows random access because array works at the index basis.
//In ArrayList, manipulation is little bit slower 
//than the LinkedList in Java because a lot of
//shifting needs to occur if any element is removed from the array list.

class Book {

	int id;
	String name;
	String author;
	String publisher;

	public Book(int id, String name, String author, String publisher) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
	}

}

public class ListDemo {

	public static void main(String ar[]) {

		List<Book> booklist = new ArrayList<Book>();
		
	//	List booklist1 = new ArrayList();//raw old  java code
          //Object type is in nature
		Book b1 = new Book(101, "java book", "abc", "barren and harrysoce");
		Book b2 = new Book(102, "java book", "xyz", "barren ");
		Book b3 = new Book(103, "java book", "abc", "harrysoce");

		booklist.add(b1);
		booklist.add(b2);
		booklist.add(b3);
		
		
	//	booklist1.add(b1);///   string,object,integer,double
		
	//	Object b6 =(Object)booklist1;

		for (Book b : booklist) {

			System.out.println("id " + b.id + "  author " + b.author);
		}

	}

}
