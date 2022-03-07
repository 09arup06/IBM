package p1;

public class Account {
	private int acntNo;
	private String holder;
	private double balance;
public Account() {
}
public Account(int acntNo, String holder, double balance) {
	this.acntNo = acntNo;
	this.holder = holder;
	this.balance = balance;
}
public void summary() {
	System.out.println("A/*C No: "+acntNo);
	System.out.println("Holder: "+holder );
	System.out.println("balance:" +balance);
	}
public void deposit(double amount)
{
	balance+=amount;
}
public void withdraw(double amount) {
	if(amount<=balance) 
		balance-=amount;
	else
			System.out.println("Insufficient balance");
	}
}

