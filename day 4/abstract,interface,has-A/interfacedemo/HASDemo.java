package com.demo.interfacedemo;

import com.demo.engine.Engine5;

class Car {

	void speed() {
		System.out.println("speed");
	}

	void color() {

		System.out.println("color");
	}

}

class Engine {

	void start() {
		System.out.println("start");
	}

	void stop() {
		System.out.println("stop");
	}
}

class Engine8 {

	void start() {
		System.out.println("start 8");
	}

	void stop() {
		System.out.println("stop 8");
	}
}

class XyzImp extends Car {

	void speed() {
		System.out.println("xyz speed");

	}

	void color() {

		System.out.println(" xyz color");
	}

// this method is from xyzimp
	void getEngine() {

		Engine8 e2 = new Engine8();// implement their methods

		Engine e1 = new Engine(); // plugin the component of engine class
		e1.start();
		e1.stop();

		Engine5 e5 = new Engine5();  // come from another pack

		e5.startEngine5();///
	}

}

//HAs-A
public class HASDemo {

	public static void main(String ar[]) {

		XyzImp z1 = new XyzImp();
		z1.color();
		z1.speed();
		z1.getEngine();

	}

}
