package com.ibm.lib;

import com.ibm.bank.BalanceException;

public class TestLibrary {

	public static void main(String[] args)throws BookException {
Book b1= new Book("The Alchemist");
Member m1= new Member("George");
Member m2=  new Member("jack");
b1.status();
m1.status();
try {
	b1.issueBook(m1);
}catch(BookException e) {
	//e.printStackTrace();
	//System.out.println(e);
	System.out.println(e.getMessage());
}
 b1.status();
 m1.status();
 
 b1.returnBook(m1);
 b1.status();
 m1.status();
	}

}
