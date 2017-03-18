package generics;

import java.util.*;

class AccountManager {
	private Map<String, Integer> accountTotals = new HashMap<String, Integer>();
	//private Map<Integer, String> accountTotals = new HashMap<Integer, String>(); -- No
	//private Map<String<Integer>> accountTotals = new HashMap<String<Integer>>(); -- No
	private int retirementFund;

	public int getRetirementFund() {
		return this.retirementFund;
	}

	public static void main(String args[]) {
		AccountManager am1 = new AccountManager();
		am1.accountTotals.put("V349233", 1000);
		am1.accountTotals.put("V999933", 10000);
		am1.setBalance("V349233", 90000000);
		System.out
				.println("Amount for V349233 is " + am1.getBalance("V349233"));

		System.out.println("PF for V349233 is " + am1.getRetirementFund());

	}

	public int getBalance(String accountName) {
		Integer total = (Integer) accountTotals.get(accountName);
		if (total == null)
			total = Integer.valueOf(0);
		return total.intValue();
	}

	public void setBalance(String accountName, int amount) {
		accountTotals.put(accountName, Integer.valueOf(amount));
	}
}