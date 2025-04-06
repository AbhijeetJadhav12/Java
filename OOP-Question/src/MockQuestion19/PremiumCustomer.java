package MockQuestion19;

public class PremiumCustomer extends customer {

	public PremiumCustomer(double balance) {
		super(balance);
	}

	final static double discount = 10;

	@Override
	void addTransaction(double amount) {
		if (amount > 0) {
			double dis = (amount * discount) / 100;
			balance += dis;
		}
	}

}
