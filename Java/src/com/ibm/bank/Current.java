package com.ibm.bank;

public class Current extends Account {
	private double overdraft;

	public Current() {
	}

	public Current(String holder) {
		super(holder, init_current_bal);
		overdraft = overaft_limit;
		txns[idx++]= new CurrentTransaction("OB",init_current_bal,balance,overaft_limit);
	}

	public void summary() {
		super.summary();
		System.out.println("overdraft amount is: " + overdraft);
	}

	public void deposit(double amount) {
		overdraft += amount;
		if (overdraft >= overaft_limit) {
			balance += (overdraft - overaft_limit);
			overdraft = overaft_limit;
		}
		txns[idx++]= new CurrentTransaction("Cr",amount,balance,overdraft);

	}

	public void withdraw(double amount) throws BalanceException {
		if (amount <= (balance + overdraft)) {
			balance -= amount;
			if (balance < min_current_bal) {
				overdraft += balance;
				balance = min_current_bal;
			}
			txns[idx++]= new CurrentTransaction("Dr",amount,balance,overdraft);
		} else
			throw new BalanceException("Insufficient Balance");
	}

	public String print() {
		// TODO Auto-generated method stub
		return null;
	}
}
