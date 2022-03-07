package p1;

import java.util.Scanner;

public class sumavg {
	public static void main(String[] args) {
	int []A= {};
	int []B= {};
	int []C= {};
	A=new int[5];
	B=new int[5];
	C=new int[10];

	Scanner sc=new Scanner(System.in);
	for(int i=0;i<A.length;i++)
	{
		A[i]=sc.nextInt();
	}
	int avg=0,sum=0;
	for(int i=0;i<A.length;i++)
	{
		sum+=A[i];
	}
	avg=sum/A.length;
	System.out.println("The sum is:" +sum);
	System.out.println("The average is:" +avg);
	
}
}
