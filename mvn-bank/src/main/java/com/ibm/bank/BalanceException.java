package com.ibm.bank;

public class BalanceException extends Exception {
	public BalanceException(double balance) {
		super();
	}

public BalanceException(String msg) {
	super(msg);
}
}
