package Accountpackage;

public class TestAccount extends AccountImpl{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestAccount t1 = new TestAccount();
		t1.deposit(100);;
		t1.withdraw(50);
		t1.calcinterest();
		System.out.println(t1.balance);
	}

}
