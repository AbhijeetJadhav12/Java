package MockQuestion20;

import java.util.Scanner;

public class MockQuestion20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stringtemplte st = null;
		StringHelper sh = new StringHelper();

		do {
			System.out.println();
			System.out.println("1 Extract Digit");
			System.out.println("2 Count Wovel");
			System.out.println("Enter choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				st = new ExtractDigit();
				st.setString("Abhi123Jadhav");
				sh.performOperation(st);
				break;
			case 2:
				st = new CountWovel();
				st.setString("abhijeet");
				sh.performOperation(st);
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
			}
		} while (true);
	}

}
