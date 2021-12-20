package com.demo.iopack;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputSreamDemo {

	public static void main(String ar[]) throws IOException {

		FileOutputStream f = new FileOutputStream("abc.txt");

		f.write(65);
		f.close();
		System.out.println("done...");

	}

}
