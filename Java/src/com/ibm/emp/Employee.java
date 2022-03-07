package com.ibm.emp;
/**
 * hi my name is asadsadads
 * this is an important program 
 * this should reflect in there
 * @author Arup */
public abstract class Employee {
	
	private int empNo;
	private String empName;
	private double salary;
	static int counter=1000;
	public Employee() {
	}
	public Employee(String empName, double salary) {
		
		this.empNo=counter++;
		this.empName = empName;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}
	/**non parameterised cons
	 * @param no one
	 * */
	public void payslip() {
		System.out.println("EMp No: " + empNo);
		System.out.println("Emp Name: " + empName);
		System.out.println("Salary: " + salary);
	}
}
