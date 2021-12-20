package com.demo.iopack;


import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {

		FileReader ioreader = new FileReader("demo.txt");

		int i;

		while ((i = ioreader.read()) != -1) {

			System.out.println((char) i);

		}

		ioreader.close();

	}

}
