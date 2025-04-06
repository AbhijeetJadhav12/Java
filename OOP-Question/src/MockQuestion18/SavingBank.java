package MockQuestion18;

public class SavingBank extends Bank {

	SavingBank(double balance) {
		super(balance);
	}

	final static double transaction_fee = 2;

	@Override
	void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	@Override
	void withdraw(double amount) {
		if (transaction_fee + amount <= balance) {
			balance -=transaction_fee+amount;
		}

	}
}
