package p2;


	
	import java.util.Scanner;
	public class PizzaCheckout {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size you wanna buy:\n 'L' for Large \n 'S' for Small \n 'R' for Pizza Mania \n 'M' for Medium \n   ");
	String s=sc.nextLine();
	System.out.println("Enter crust type: \n 'C' for Classic Hand Tossed \n 'F'for Fresh Pan \n");
	String s2= sc.nextLine();
	System.out.println("Enter the no. of pizzas you wanna buy: ");
	int n= sc.nextInt();
	System.out.println("Do you want extra Mayonese Dip? \n 'Y' for Yes \n 'N' for No \n");
	String s3=sc.nextLine();
	s3= sc.nextLine();
	sc.close();
	Pizza pi = new Pizza(s3,s2,s,n);
	pi.price();
	}
	}