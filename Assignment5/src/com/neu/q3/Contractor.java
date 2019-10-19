package com.neu.q3;

public class Contractor extends Employee {

	private int workingHours;
	
	public Contractor() {
		
	}
	
	public Contractor(String name, int paymentPerHour, int workingHours) {
		super(name, paymentPerHour);
		this.workingHours = workingHours;
	}
	
	@Override
	public int calculateSalary() {
		return this.workingHours * this.getPaymentPerHour();
	}

}
