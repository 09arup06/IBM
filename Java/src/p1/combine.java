package p1;

import java.util.Scanner;

public class combine {
	public static void main(String[] args) {
		int[] A = new int [5];
		int[] B = new int[5];
		int[] C = new int[A.length+B.length];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
			C[i] = A[i];
		}
		for (int k = 0; k < B.length; k++) {
			B[k] = sc.nextInt();
			C[k + A.length] = B[k];
		}
		for (int i = 0; i < C.length; i++) {
			System.out.println(C[i]);
		}

		sc.close();

	}
}
