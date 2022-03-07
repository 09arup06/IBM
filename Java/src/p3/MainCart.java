package p3;

import java.util.Scanner;

import com.ibm.bank.BalanceException;

public class MainCart {
	public static void main(String[] args) throws ShopException {
		ShoppingCart s1 = new ShoppingCart();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many products you wanna buy: ");

		n = sc.nextInt();
		sc.nextLine();
		String prdct[] = new String[n];
		int qty[] = new int[n];
		if (n < 5) {
			for (int k = 0; k < n; k++) {
				System.out.println("Enter the product names: ");
				prdct[k] = sc.nextLine();
			}
			for (int j = 0; j < n; j++) {
				System.out.println("Enter the quantity u wanna buy for " + prdct[j] + " :");
				qty[j] = sc.nextInt();
				System.out.println("-------------" + j);
			}
			for (int p = 0; p < n; p++) {
				s1.addtoCart(prdct[p], qty[p]);
				System.out.println("--------------------");
			}
		} else
			throw new ShopException("Your cart value cant exceed more than 5 products.");

		// System.out.println("Your cart value cant exceed more than 5 products.");
	}
}