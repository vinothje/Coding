package Accountpackage;

public abstract class AbsAccount {
	double balance;
	public void deposit(double amount) {
		this.balance = this.balance + amount;
		System.out.println("depositing :" + amount);
	}
	
	public void withdraw(double amount) {
		this.balance = this.balance - amount;
		System.out.println("withdrawing :" + amount);
	}
	
	public abstract void calcinterest();

}
