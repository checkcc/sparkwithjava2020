package com.demo.exceptionsdemo;

import java.io.IOException;

class M {
	// logic part
	void show() throws IOException {
		
		System.out.println("inside show()");
		throw new IOException("device error");
	   //	throw new IOException();
		
	}

}

//UI or htm 
public class ThrowsDemo {
	public static void main(String ar[]) {
		
		M m = new M();
		try {
			m.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("exception handlded");
		}
		
		System.out.println("normal flow");

	}

}
