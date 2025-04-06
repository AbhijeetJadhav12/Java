package j_abhi.com;

public class Bill {

	Customer c;
	Product p[];

	void calBill(Customer c, Product... p) {
		double total = 0, totalBill = 0;
		System.out.println("Customer Name: " + c.getName());
		System.out.println("Mobile N0.:" + c.getMobileNumber());
		System.out.println("----------------------------------------------");
		System.out.println("Id\tName\tQuantity\tRate\tTotal");
		System.out.println("----------------------------------------------");
		for (int i = 0; i < p.length; i++) {
			total = p[i].getQuantity() * p[i].getPrice();
			totalBill += total;
			System.out.println(p[i].getpId() + "\t" + p[i].getName() + "\t\t" + p[i].getQuantity() + "\t"
					+ p[i].getPrice() + "\t" + total);
		}
		System.out.println("----------------------------------------------");

		System.out.println("Total Bill: " + totalBill);
	}
}
