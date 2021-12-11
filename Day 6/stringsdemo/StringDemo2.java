package com.demo.stringsdemo;

public class StringDemo2 {

	public static void main(String[] args) {
	
		String s1 = " java";   //string literal
		
		char chararray[]= {'j','a','v','a'};
		
		
		String s4="Sachin ";
		
		s4=s4.concat("kumar");
		
		StringBuffer s5 = new StringBuffer("java");
		
		s5.append(" tutorial");
		
		StringBuilder s6 =  new StringBuilder();
		
		s6.append("point");
		
		
		
		
		
		System.out.println(s4);
		
		String s2 = new String(chararray);//char array into string
		
		String s3 = new String(chararray);//creating java string by new keyword
	

	}

}
