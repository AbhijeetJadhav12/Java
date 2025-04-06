package j_abhi.com;

import java.util.Scanner;

public class BiilingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Customer cust = new Customer(1, "Abhijeet", 9359760915l);
		Product p[] = new Product[3];

		for (int i = 0; i < p.length; i++) {
			p[i] = new Product();
			System.out.println("Enter id,name,price,qty for product");
			p[i].setpId(sc.nextInt());
			sc.nextLine();
			p[i].setName(sc.nextLine());
			p[i].setPrice(sc.nextInt());
			p[i].setQuantity(sc.nextInt());
		}

		Bill b = new Bill();
		b.calBill(cust, p);
	}

}
