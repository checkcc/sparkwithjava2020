package com.demo.interfacedemo;

///IS-A

interface admin {

	public abstract void read();

	String write(int flag);

	double execute(double flag1, double flag2);

}

class Admin1 implements admin {

	@Override
	public void read() {
		System.out.println("read");

	}

	@Override
	public String write(int flagnote) {
		int k = 101;
		String n = String.valueOf(k); // type casting
		return n;
	}

	@Override
	public double execute(double flag1, double flag2) {

		double pp = flag1 + flag2;

		return pp;
	}

}

public class InterfaceDemo {

	public static void main(String[] args) {

		Admin1 a1 = new Admin1();
		a1.read();
		String s = a1.write(5);
		System.out.println(s);
		double d = a1.execute(2.5, 2.5);

		System.out.println(d);

	}

}
