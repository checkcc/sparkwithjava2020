package com.demo.streamdemo;

import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String ar[]) {

Stream.iterate(1,element -> element + 1).filter(element ->element % 5 == 0).limit(5)
.forEach(System.out::println);
	}

}
