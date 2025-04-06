package MockQuestion19;

public class RegularCustomer extends customer {

	public RegularCustomer(double balance) {
		super(balance);
	}

	@Override
	void addTransaction(double amount) {
		if (amount > 0) {
			balance += balance;
		}
	}

	double getBalance() {
		return balance;
	}

}
