package com.ibm.bank;

public abstract class Account implements Bank {
	static int counter=init_acnt_no;
	private int acntno=counter;
	private String holder;
	protected double balance;
	protected Transaction[] txns;
	protected int idx;
public Account() {
	// TODO Auto-generated constructor stub
}
public Account(String holder, double balance)
{
	super();
	this.acntno=counter++;
	this.holder=holder;
	this.balance=balance;
	txns=new Transaction[10];
	
}
public void summary()
{
	System.out.println("The account number is: "+acntno);
	System.out.println("The holder name is: "+holder);
	System.out.println("The balance is: "+balance);
}
public double getBalance() {
	return balance;
}
public void deposit(double amount)
{
	balance+=amount;
	txns[idx++]=new Transaction("Cr",amount,balance);
}
public abstract void withdraw(double amount) throws BalanceException;
public void statement()
{System.out.println("Statement of A/C: "+acntno);
for(int i=0;i<idx;i++)
{
	System.out.println(txns[i].print());

}
}
}
