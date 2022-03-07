package com.ibm.bank;

public class CurrentTransaction  extends Transaction{
private double overdraft;
public CurrentTransaction() {
	// TODO Auto-generated constructor stub
}
public CurrentTransaction(String type, double amount, double balance,double overdraft) {
	super(type,amount,balance);
	this.overdraft = overdraft;
}

public String print()
{
	return super.print()+"\t"+overdraft;
}
}
