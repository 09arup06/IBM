package com.ibm.emp;

import p1.Employee;

public class Executive extends Employee {
	private double incentives;

	public Executive() {
	}

	public Executive(String empName, double salary, double incentives) {
		super(empName, salary);
		this.incentives = incentives;
	}

	public double getSalary() {
		return super.getSalary() + incentives;
	}

	public void payslip() {
		super.payslip();
		System.out.println("incentive is: " + incentives);
	}
}
