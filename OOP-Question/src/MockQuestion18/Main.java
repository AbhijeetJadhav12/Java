package MockQuestion18;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank b = null;
		double balance = 0;
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			b = new SavingBank(5000);
			System.out.println("Enter money to Deposit");
			double depositAmount = sc.nextDouble();
			b.deposit(depositAmount);
			balance = b.getBalance();
			System.out.println("Balance in Saving Bank is: " + balance);
			System.out.println("Enter amount to withdraw");
			double withdrawAmount = sc.nextDouble();
			b.withdraw(withdrawAmount);
			balance = b.getBalance();
			System.out.println("Balance in Saving Bank is: " + balance);
			break;

		case 2:
			b = new CuurentBank(10000);
			System.out.println("Enter amount to deposit");
			depositAmount = sc.nextDouble();
			b.deposit(depositAmount);
			balance = b.getBalance();
			System.out.println("Balance for Current Bank is: " + balance);
			System.out.println("Enter amount to withdraw");
			withdrawAmount = sc.nextDouble();
			b.withdraw(withdrawAmount);
			balance = b.getBalance();
			System.out.println("Balance for Current Bank is: " + balance);

			break;

		default:
			System.out.println("invalid Choice");
		}

	}
}
