package com.neu.q2;

public class Number {

	/**
	 * Integer.MIN_VALUE will be returned when exception occured
	 * @param a
	 * @param b
	 * @return
	 */
	public int count(int a, int b) {
		try {
			return a/b;
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return Integer.MIN_VALUE;
	}
	
}
