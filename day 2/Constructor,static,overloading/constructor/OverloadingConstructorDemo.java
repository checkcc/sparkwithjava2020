package com.demo.constructor;

class Sub{
	//no paraemter
	Sub(){
		System.out.println("overload demo");
	}
	//single parameter
	Sub(int i){
		System.out.println("overload demo"+i);
	}
	//double parameter
	Sub(double i,double j){
		double c=i+j;//
		System.out.println("overload demo"+i+""+c);
	}
	
}

public class OverloadingConstructorDemo {
	public static void main(String ar[]) {
		
		Sub s1=  new Sub();
		Sub s2=  new Sub(5);
		Sub s3=  new Sub(2.5,8);

	}

}
