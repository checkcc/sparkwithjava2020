package com.demo.collectiondemo;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String ar[]) {

		Map<Integer, String> map = new TreeMap<Integer, String>(); // legacy way

		map.put(1, "Ram");
		map.put(2, "Sham");
		map.put(3, "Arnav");
		map.put(4, "john");
		// converter onto set
		Set set = map.entrySet();

		Iterator itr = set.iterator();

		while (itr.hasNext()) {

			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) itr.next();
			System.out.println(" Key--->" + entry.getKey() + "value -->" + entry.getValue());
		}

	}

}
