import java.util.*;

public class Rev4D19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println();
			System.out.println("1 Find First And Last Digit ");
			System.out.println("2 Sum of First and Last Digit");
			System.out.println("3 Swap First and Last Digit");
			System.out.println("4 Sum of Digit of Number");
			System.out.println("5 Product of Digit of Number");
			System.out.println("Enter Your Choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Number");
				int no = sc.nextInt();
				findFirstAndLastDigit(no);
				break;
			case 2:
				System.out.println("Enter Number");
				no = sc.nextInt();
				sumOfFirstAndLastDigit(no);
				break;
			case 3:
				System.out.println("Enter Number");
				no = sc.nextInt();
				swapFirstAndLastDigit(no);
				break;
			case 4:
				System.out.println("Enter Number");
				no = sc.nextInt();
				sumOfDigit(no);
				break;
			case 5:
				System.out.println("Enter Number");
				no = sc.nextInt();
				productOfDigit(no);
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
			}
		} while (true);
	}

	private static void productOfDigit(int no) {
		int product = 1;
		while (no != 0) {
			int rem = no % 10;
			product *= rem;
			no /= 10;
		}
		System.out.println("Product of Digits in Number:" + product);
	}

	private static void sumOfDigit(int no) {
		int sum = 0;
		while (no != 0) {
			int rem = no % 10;
			sum += rem;
			no /= 10;
		}
		System.out.println("Sum of Digits: " + sum);
	}

	private static void swapFirstAndLastDigit(int no) {
		int count = 0;
		int temp = no;
		while (no != 0) {
			count++;
			no /= 10;
		}
		no = temp;
		int lastDigit = no % 10;
		no /= 10;
		int middleNumbers = 0;

		middleNumbers = (int) (no % Math.pow(10, count - 2));

		no = temp;

		int rev = 0;
		while (no != 0) {
			int rem = no % 10;
			rev = rev * 10 + rem;
			no /= 10;
		}
		int firstDigit = rev % 10;
		int swappedNumber = (int) (lastDigit * Math.pow(10, count - 1)) + middleNumbers * 10 + firstDigit;
		System.out.println("Number After swapping first and last Digit:" + swappedNumber);
	}

	private static void findFirstAndLastDigit(int no) {

		int lastDigit = no % 10;
		int rev = 0;
		while (no != 0) {
			int rem = no % 10;
			rev = rev * 10 + rem;
			no /= 10;
		}
		int firstDigit = rev % 10;

		System.out.println("First Digit: " + firstDigit);
		System.out.println("Last Digit: " + lastDigit);
	}

	private static void sumOfFirstAndLastDigit(int no) {
		int lastDigit = no % 10;
		int rev = 0;
		while (no != 0) {
			int rem = no % 10;
			rev = rev * 10 + rem;
			no /= 10;
		}
		int firstDigit = rev % 10;

		int sum = firstDigit + lastDigit;
		System.out.println("Sum fo First and Last Digit: " + sum);
	}

}
