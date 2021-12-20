package com.demo.collectiondemo;

import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

// we can this datastructure  in batch jobs

public class QueueDemo {

	public static void main(String ar[]) {

		Queue<String> lines = new PriorityQueue<String>();

		// peek,element

		lines.add("ram");
		lines.add("sham");
		lines.add("arnav");
		lines.add("varun");

		System.out.println("head----> " + lines.element());

		System.out.println("head --->" + lines.peek());

		Iterator itr = lines.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());

		}

		// System.out.println("head --->" + lines.remove());
		// System.out.println("head --->" + lines.poll());

	}

}
