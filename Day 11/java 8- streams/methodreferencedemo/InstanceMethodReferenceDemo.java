package com.demo.java8.methodreferencedemo;

// based on instance method reference
interface Messagble1 {

	void getMessage(String msg);
}

class Message1 {

	void Show(String msg) {

		System.out.println("from method");
		System.out.println("=====================" + msg);
	}
}

public class InstanceMethodReferenceDemo {

	public static void main(String[] args) {

		Message1 m = new Message1();

		Messagble1 messagble1 = m::Show;

		messagble1.getMessage("hi");

	}

}
