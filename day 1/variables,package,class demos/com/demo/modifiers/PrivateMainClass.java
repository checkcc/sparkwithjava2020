package com.demo.modifiers;

public class PrivateMainClass {
	
	public static void main(String ar[]) {
		
		PrivateModifierDemo s = new PrivateModifierDemo();
		
		  //view part not one can edit
	long dummy = s.getAccountnumber();
	
	  s.setAccountnumber(100);
	  
	  long dummyacc =s.getAccountnumber();
	
    System.out.println(dummyacc);
    
    
         s.setName("ram kumar");  //edited the value here
         
         String getdummyname=s.getName();  // and retrive here
		
         System.out.println(getdummyname);
	}

}
