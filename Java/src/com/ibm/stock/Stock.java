package com.ibm.stock;

public class Stock implements Exchange {
	private static Stock Instance;
	Stock() {}
	public static Stock getInstance() {
		if(Instance==null)
			Instance= new Stock();
		return Instance;
	}
	public void set() {
		System.out.println("set quote");
	}
	public void view()
	{
		System.out.println("view quote");	
	}
	public void get() {
		System.out.println("Get quote");
	}
}

