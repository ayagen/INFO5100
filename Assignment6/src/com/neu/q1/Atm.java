package com.neu.q1;

public class Atm {
	private double availableAmountInMachine;
	private double transactionFee;
	private User userData;
	
	public Atm(double availableAmountInMachine, double transactionFee, User userData) {
		this.availableAmountInMachine = availableAmountInMachine;
		this.transactionFee = transactionFee;
		this.userData = userData;
	}
	
	public Atm() {
		
	}
	
	public double getAvailableAmountInMachine() {
		return availableAmountInMachine;
	}



	public void setAvailableAmountInMachine(double availableAmountInMachine) {
		this.availableAmountInMachine = availableAmountInMachine;
	}



	public double getTransactionFee() {
		return transactionFee;
	}



	public void setTransactionFee(double transactionFee) {
		this.transactionFee = transactionFee;
	}



	public User getUserData() {
		return userData;
	}



	public void setUserData(User userData) {
		this.userData = userData;
	}

}
