package com.ibm.bank;

public interface Bank {
int init_acnt_no=100;
double min_savings_bal=1000;
double init_current_bal=5000;
double min_current_bal=0;
double overaft_limit=10000;
 void deposit(double amount);
 void withdraw(double amount) throws BalanceException;
 void summary();
 void statement();

}
