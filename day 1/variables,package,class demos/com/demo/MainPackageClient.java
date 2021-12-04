package com.demo;

import com.demo.addition.AdditionDemo4;
import com.demo.substraction.SubstractionDemo4;

//2021
public class MainPackageClient {

	public static void main(String arg[]) {

		SubstractionDemo4 sub = new SubstractionDemo4();

		int resultOfSub = sub.Sub4(4, 2); // collect the resut from the substraction class

		System.out.println("result from main class sub " + resultOfSub);

		AdditionDemo4 add = new AdditionDemo4();

		int resultOfadd = add.Addtion4(5, 5);// collect the resut from the substraction class

		System.out.println("result from main class add " + resultOfadd);

	}

}
