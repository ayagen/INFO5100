package com.neu.q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class User {

	private int id;
	private String name;
	private int age;
	private String address;
	private String phoneNumber;
	private String bankAccountNumber;
	private String password;

	private List<Transaction> transactions;
	

	public User() {
		transactions = new ArrayList<Transaction>();
	}
	
	public User(String bankAccountNumber, String password) {
		this.bankAccountNumber = bankAccountNumber;
		this.password = password;
		transactions = new ArrayList<Transaction>();
	}
	
	public User(int id, String name, int age, String address, String phoneNumber, String bankAccountNumber, String password) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.bankAccountNumber = bankAccountNumber;
		this.password = password;
		
		transactions = new ArrayList<Transaction>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	
	public static User registerUser(String accountNumber, String password) {
		User user = DB.queryUser(accountNumber);
		if(user != null) {
			return user;
		}
		user = new User(accountNumber, password);
		DB.saveUser(user);
		return user;
	}
	
	public static boolean login(String accountNumber, String password) {
		User user = DB.queryUser(accountNumber);
		if(user == null) {
			return false;
		}
		if(!user.getPassword().equals(password)) {
			return false;
		}
		return true;
	}
	
	public boolean resetPassword(String accountNumber, String name, int age, String phoneNumber) {
		User user = DB.queryUser(accountNumber);
		if(user == null) {
			System.out.println("reset password failed, no account number found: " + accountNumber);
			return false;
		}
		if(!user.getName().equals(name) || user.getAge() != age || !user.getPhoneNumber().contentEquals(phoneNumber)) {
			System.out.println("reset password failed, name or age or phoneNumber valicate failed: " + accountNumber);
			return false;
		}
		String newPassword = String.valueOf(new Random().nextInt(1000000));
		//send email/sms to user about new password
		user.setPassword(newPassword);
		DB.saveUser(user);
		return true;
	}
	
	public double getAvailableBalance() {
		return 0;
	}
	
	public boolean withDrawal(double amount) {
		double available = getAvailableBalance();
		if(available > amount) {
			System.out.println("withdraw failed, because no available amount: " + amount + ", available: " + available);
			return false;
		}
		transactions.add(new Transaction(this.bankAccountNumber, "withdraw", amount));
		return true;
	}
	
	public User getUser(String accountNumber) {
		return DB.queryUser(accountNumber);
	}
	
	public boolean deposit(double amount) {
		transactions.add(new Transaction(this.bankAccountNumber, "deposit", amount));
		return true;
	}
	
	public List<Transaction> getRecentTransaction() {
		int size = transactions.size();
		return this.transactions.subList(size - 10, size);
	}
}
