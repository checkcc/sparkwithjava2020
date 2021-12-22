package com.demo.java8.methodreferencedemo;

import java.util.ArrayList;
import java.util.List;

// based on constructor
interface Messagble {

	Message getMessage(String msg);
}

class Message {

	Message(String msg) {

		System.out.println("from constructor");
		System.out.println("====================="+msg);
	}
}

public class MethodReferenceDemo {

	public static void main(String[] args) {

		Messagble m = Message::new;    //fashion of java 8 writing style
		m.getMessage("hi how are your");
	}

}
