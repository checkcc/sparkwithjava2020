package com.demo.stringsdemo;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {

		
		StringTokenizer t =  new StringTokenizer(" hi how are you",",");
		
		while(t.hasMoreTokens()) {
			
			System.out.println(t.nextToken());
		}

	}

}
