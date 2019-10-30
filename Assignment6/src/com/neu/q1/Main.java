package com.neu.q1;

public class Main {
	
	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		String accountNumber = "210333330020199";
		String password = "123456";
		User user = User.registerUser(accountNumber, password);
		if(user != null) {
			System.out.println("user register success: " + accountNumber);
			boolean login = User.login(accountNumber, password);
			if(login) {
				System.out.println("user login successfully: " + accountNumber);
			} else {
				System.out.println("user login failed: " + accountNumber);
			}
		} else {
			System.out.println("user register fail, accountNumber existed: " + accountNumber);
		}
			
		boolean login = User.login(accountNumber, password);
		if(!login) {
			System.out.println("user login failed, wrong data provided: " + accountNumber);
		}
		
		double availableAmountInMachine = 10000;
		double transactionFee = 0;
		Atm atm = new Atm(availableAmountInMachine, transactionFee, user);
		
		double availableBalance = user.getAvailableBalance();
		if(availableBalance <= 0) {
			System.out.println("balance error: " + availableBalance);
		}
		
		double withDrawAmount = 30;
		boolean withDrawResult = user.withDrawal(withDrawAmount + atm.getTransactionFee());
		if(!withDrawResult) {
			System.out.println("withdraw error: " + withDrawAmount);
		}
		
		atm.setAvailableAmountInMachine(atm.getAvailableAmountInMachine() - withDrawAmount + atm.getTransactionFee());
		
		double depositAmount = 100;
		boolean depositResult = user.deposit(depositAmount - atm.getTransactionFee());
		if(depositResult) {
			atm.setAvailableAmountInMachine(atm.getAvailableAmountInMachine() + depositAmount + atm.getTransactionFee());
		}
		
		
		
	}
}
