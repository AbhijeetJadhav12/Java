package MockQuestion18;

abstract class Bank {
	double balance ;

	Bank(double balance){
		this.balance=balance;
	}
	abstract void deposit(double amount) ;

	abstract void withdraw(double amount) ;
	

	double getBalance() {
		return balance;
	}
}
