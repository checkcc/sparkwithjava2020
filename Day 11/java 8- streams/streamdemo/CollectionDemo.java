package com.demo.streamdemo;

import java.util.ArrayList;
import java.util.List;

class Product {

	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class CollectionDemo {

	public static void main(String[] args) {

		List<Product> productlist = new ArrayList<Product>();
		productlist.add(new Product(1, "samsung", 2000));
		productlist.add(new Product(2, "MI", 3000));
		
		productlist.add(new Product(1, "samsung", 2000));
		productlist.add(new Product(2, "iphone", 4000));
                  // applied streams on over the java collections
		productlist.stream().filter(product -> product.price == 4000)
				.forEach(product -> System.out.println(product.name));
	}

}
