package com.demo.iopack;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * An InputStreamReader is a bridge from byte streams to character streams: 
 * It reads bytes and decodes them into characters using a specified charset.
 *  The charset that it uses may be specified by name or may be given explicitly,
 *   or the platform's default charset may be accepted
 * 
 * */

public class InputStreamDemo {

	public static void main(String[] args) throws IOException {

		InputStream fin = new FileInputStream("demo.txt");

		Reader readbin = new InputStreamReader(fin);

		int i = readbin.read();

		while ((i = readbin.read()) != -1) {

			System.out.println((char) i);

			i = readbin.read();

		}

		fin.close();

		readbin.close();

	}

}
