package com.ibm.bank;

public class Transaction extends Savings{
	private String type;
	private double amount;
	private double balance;
	
public Transaction() {
	// TODO Auto-generated constructor stub
}

public Transaction(String type, double amount, double balance) {
	this.type = type;
	this.amount = amount;
	this.balance = balance;
}

public String print() {
	return type+"\t"+amount+"\t"+balance;
}

}
