package threads;

public class Account {

	private int balance = 50;

	public int getBalance() {
		return balance;
	}

	public void withdraw(int withdrawal) {
		balance = balance - withdrawal;
	}

}
