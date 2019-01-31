package com.skillrary.threads;

public class CreditAccount {
	private int balance=5000;
	public int getBalance() {
		return balance;
		
	}
	public void withdraw(int amount) {
		balance=balance-amount;
	}

}
