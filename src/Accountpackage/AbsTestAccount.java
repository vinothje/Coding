package Accountpackage;

public class AbsTestAccount extends AbsAccount{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsTestAccount t1 = new AbsTestAccount();
		t1.deposit(100);
		t1.withdraw(50);
		t1.calcinterest();
	}
	
	public void calcinterest() {
		System.out.println("interest :" + this.balance * 0.05);
	}

}
