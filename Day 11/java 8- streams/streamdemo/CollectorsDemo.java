package com.demo.streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product2 {

	int id;
	String name;
	float price;

	public Product2(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class CollectorsDemo {

	public static void main(String[] args) {

		List<Product2> productlist = new ArrayList<Product2>();
		productlist.add(new Product2(1, "samsung", 2000));
		productlist.add(new Product2(2, "MI", 3000));
		productlist.add(new Product2(1, "samsung", 7000));
		productlist.add(new Product2(2, "iphone12", 4000));
		productlist.add(new Product2(2, "iphone13", 60000));
		productlist.add(new Product2(2, "iphone14", 75000));

		// applied streams on over the java collections

		Set<Float> prod =productlist.stream().map(product2 -> product2.price)  //fecting price
		                    .collect(Collectors.toSet());    ///collecting as list

		System.out.println(prod);

	}

}
