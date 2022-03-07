package p1;

import com.ibm.emp.Executive;

public class TestEmployee {
	public static void main(String[] args) {
		Executive ex1 = new Executive("hool", 5000, 500);
		Manager m1 = new Manager("jack", 1000, 5000);
		Employee emp= m1;
		showsalary(ex1);
		showsalary(m1);
	}
private static void showsalary(Employee emp) {
	if(emp instanceof Executive)
	{
		System.out.println("Executive salary is: "+emp.getSalary());
	}
	else
		System.out.println("Manager salary is: "+emp.getSalary());
}
	/*private static void showsalary(Executive ex1) {
		System.out.println("Executive Salary: " + ex1.getSalary());
	}

	private static void showsalary0(Manager m1) {
		System.out.println("manager salary: " + m1.getSalary());
	}*/
}
