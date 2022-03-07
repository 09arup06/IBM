package p2;

import com.ibm.bank.BalanceException;

public class Savings extends Account {
	

	public Savings() {
	}

	public Savings(String holder) {
		super(holder,min_savings_bal);
		this.balance=min_savings_bal;
		txns[idx++]= new Transaction("OB",min_savings_bal,balance);
	}

	public void withdraw(double amount) throws BalanceException {
		if (amount < (balance - min_savings_bal))
			{balance -= amount;
		txns[idx++]=new Transaction("Dr",amount,balance);}
		else
			System.out.println("Insufficient Balance");
	}

}
