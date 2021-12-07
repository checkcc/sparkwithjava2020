package com.demo.inheritance;

// for overriding inheritance is must
// final key avoid the overridinng
// static method of base class cannot be overide if child class have non static members


//final Banks{
 class Banks {
	final static  int accountnumber=987877;


	void Deposit() {

		System.out.println("Deposit");

	}

}

class ABCBank1 extends Banks {
	final static int accountnumber=10001;

	void Deposit() {

		System.out.println(" ABCBank Deposit");

	}

}

class XYZBank1 extends Banks {
	
	 int accountnumber=10114457;

	void Deposit() {

		System.out.println(" XYZBank Deposit");

	}

}

public class FinalKeyWordDemo {

	public static void main(String arg[]) {

		Banks bank = new Banks();
		bank.Deposit();

		ABCBank abcbank = new ABCBank(); //
		abcbank.Deposit();

		Banks bank1 = new ABCBank1();// dyanamic dispatch or overiding
		bank1.Deposit();

		Banks bank2 = new XYZBank1();// dyanamic dispatch
		bank2.Deposit();

	}

}
