package p1;

public class Manager extends Employee {
	private double comission;

	public Manager() {
	}

	public Manager(String empName, double salary, double comission) {
		super(empName, salary);
		this.comission = comission;
	}

	public double getSalary() {
		return super.getSalary() + comission;
	}
	public void payslip()
	{
		super.payslip();
		System.out.println("Comission is "+ comission);
	}
}
