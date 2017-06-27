package Accountpackage;

public class AccountImpl implements Account{
	double balance;
	
	public void deposit(double amount) {
		this.balance = amount;
		System.out.println("depositing " + amount);
	}
	
	public void withdraw(double amount) {
		this.balance = balance - amount; 
		System.out.println("withdrawing " + amount);
	}
	
	public void calcinterest() {
		this.balance = balance * 0.03;
		System.out.println("interest " + balance);
	}
}
