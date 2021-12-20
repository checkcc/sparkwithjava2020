package com.demo.iopack;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
 * he important points about BufferedInputStream are:

When the bytes from the stream are skipped or read, the internal buffer
automatically refilled from the contained input stream, many bytes at a time.
 
When a BufferedInputStream is created, an internal buffer array is created.
 * 
 * 
 * */

public class BufferedInputStreamDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream fin = new FileInputStream("demo.txt");

		BufferedInputStream readbin = new BufferedInputStream(fin);

		int i;

		while ((i = readbin.read()) != -1) {

			System.out.println((char) i);

		}

		fin.close();

		readbin.close();

	}

}
