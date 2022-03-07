package com.ibm.bank;

import p2.AccountFactory;

public class TestAccount {
public static void main(String[] args) throws BalanceException {
	AccountFactory factory= new AccountFactory();
	Bank c= factory.openCurrent("polo");
	/*c.summary();
	System.out.println("----------------");
	c.deposit(1500);
	c.withdraw(4000);
	c.withdraw(6000);
	c.statement();*/
	/*
	c.summary();
	System.out.println("----------------");
	
	c.deposit(3000);
	c.summary();
	System.out.println("----------------");
	
	c.deposit(5000);
	c.summary();
	System.out.println("----------------5667");*/
	
	Bank s = factory.openSavings("Jack");
	try {
		s.withdraw(4000); 
	}catch(BalanceException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	/*s.deposit(2000);
	s.withdraw(1000);
	s.deposit(1000);
	s.withdraw(1500);
	s.statement();	*/
}
}
