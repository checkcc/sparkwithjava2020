package com.demo.optionaldemo;

import java.util.Optional;

public class OptionalDemoForNullPointer {

	public static void main(String ar[]) {

		String[] s = new String[10];
		
		Optional<String> nullchck = Optional.ofNullable(s[6]);
		//java 8 feature
		if(nullchck.isPresent()) {
			
			String lowercase = s[6].toLowerCase();
			System.out.println(lowercase);
			
		}else {System.out.println("string value not present");}

		
	}

}
