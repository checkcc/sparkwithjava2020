package com.demo.streamdemo;

import java.util.ArrayList;
import java.util.List;

class Product1 {

	int id;
	String name;
	float price;

	public Product1(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class FilterDemoStreams {

	public static void main(String[] args) {

		List<Product1> productlist = new ArrayList<Product1>();
		productlist.add(new Product1(1, "samsung", 2000));
		productlist.add(new Product1(2, "MI", 3000));
		productlist.add(new Product1(1, "samsung", 7000));
		productlist.add(new Product1(2, "iphone12", 4000));
		productlist.add(new Product1(2, "iphone13", 60000));
		productlist.add(new Product1(2, "iphone14", 75000));

		// applied streams on over the java collections
		productlist.stream().filter(product -> product.price > 60000)
		                    .map(product -> product.price)
				            .forEach(System.out::println);
	}

}
