package com.neu.q3;

public class FullTime extends Employee {

	@Override
	public int calculateSalary() {
		return getPaymentPerHour() * 8;
	}

}
