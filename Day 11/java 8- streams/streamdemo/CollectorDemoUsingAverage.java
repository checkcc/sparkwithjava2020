package com.demo.streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product3 {

	int id;
	String name;
	float price;

	public Product3(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class CollectorDemoUsingAverage {

	public static void main(String[] args) {

		List<Product3> productlist = new ArrayList<Product3>();
		productlist.add(new Product3(1, "samsung", 2000));
		productlist.add(new Product3(2, "MI", 3000));
		productlist.add(new Product3(1, "samsung", 7000));
		productlist.add(new Product3(2, "iphone12", 4000));
		productlist.add(new Product3(2, "iphone13", 60000));
		productlist.add(new Product3(2, "iphone14", 75000));

		// applied streams on over the java collections

		Double averagprice = productlist.stream(). // fecting price
				collect(Collectors.averagingDouble(product3 -> product3.price)); /// collecting as list

		System.out.println(averagprice);

	}

}
