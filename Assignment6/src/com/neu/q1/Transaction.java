package com.neu.q1;

public class Transaction {
	private String accountNumber;
	private String type;
	private double amount;
	
	
	public Transaction() {
		
	}
	
	public Transaction(String accountNumber, String type, double amount) {
		this.accountNumber = accountNumber;
		this.type = type;
		this.amount = amount;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
