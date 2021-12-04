package com.demo.modifiers;

public class PrivateModifierDemo {
	
	private long accountnumber = 45854555269l;
	private String name="";
	
	  //view or edit
	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
