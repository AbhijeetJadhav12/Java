package MockQuestion19;

public abstract class customer {
	double balance;
	public customer(double balance) {
		this.balance=balance;
	}
	abstract void addTransaction(double amount);
	

	double getBalnce() {
		return balance;
	}
}
