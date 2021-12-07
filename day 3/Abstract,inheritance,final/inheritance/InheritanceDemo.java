package com.demo.inheritance;

// for overriding inheritance is must
// final key avoid the overridinng
// static method of base class cannot be overide if child class have non static members

class Bank {

	  void Deposit() {

		System.out.println("Deposit");

	}

}

class ABCBank extends Bank {

	  void Deposit() {

		System.out.println(" ABCBank Deposit");

	}

}

class XYZBank extends Bank {

	void Deposit() {

		System.out.println(" XYZBank Deposit");

	}

}

public class InheritanceDemo {

	public static void main(String arg[]) {

		Bank bank = new Bank();
		bank.Deposit();

		ABCBank abcbank = new ABCBank(); //
		abcbank.Deposit();

		Bank bank1 = new ABCBank();// dyanamic dispatch or overiding
		bank1.Deposit();

		Bank bank2 = new XYZBank();// dyanamic dispatch
		bank2.Deposit();

	}

}
