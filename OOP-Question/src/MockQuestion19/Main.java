package MockQuestion19;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		customer c = null;
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			c = new PremiumCustomer(2000);
			System.out.println("Enter amount to deposit");
			double depositAmount = sc.nextDouble();
			c.addTransaction(depositAmount);
			double bal = c.getBalnce();
			System.out.println("Balance :" + bal);
			break;
		case 2:
			c = new RegularCustomer(1000);
			System.out.println("Enter amount to deposit");
			depositAmount = sc.nextDouble();
			c.addTransaction(depositAmount);
			bal = c.getBalnce();
			System.out.println("Balance :" + bal);
			break;

		default:
			System.out.println("Invalid choice");
		}
	}
}
