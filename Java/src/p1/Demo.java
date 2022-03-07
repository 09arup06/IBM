package p1;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		int[] A = {};
		A = new int[5];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		int n = A.length;
		for (int i = 0; i <= n / 2; i++) {
			int first = A[i];
			int last = A[n -i-1];
			A[i] = last;
			A[n - 1-i] = first;
		}
		for(int x:A)
			{
			System.out.println(x);
			}

		sc.close();

	}
}
