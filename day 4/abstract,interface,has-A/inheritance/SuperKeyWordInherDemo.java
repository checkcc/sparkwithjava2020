package com.demo.inheritance;

class Animal1 {
	  
	public void move() {
	      System.out.println("Animals can move");
	   }
	}


class Dog1 extends Animal1 {
	   public void move() {
	     
		   super.move();   // invokes the super class method
	   
	      System.out.println("Dogs can walk and run");
	   }
	}

	public class SuperKeyWordInherDemo {

	   public static void main(String args[]) {
	      Animal1 b = new Dog1();   // Animal reference but Dog object
	      
	      b.move();   // runs the method in Dog class
	   }
	}