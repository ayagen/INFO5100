package com.neu.q4;

public class MyIndexOutOfBoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int lowerBound;
	private int upperBound;
	private int index;
	
	public MyIndexOutOfBoundException() {
		
	}
	
	public MyIndexOutOfBoundException(int lowerBound, int upperBound, int index) {
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
		this.index = index;
	}
	
	public String toString() {
		return "Error Message: Index: " + this.index + ", but Lower bound: " + this.lowerBound + ", Upper bound: " + this.upperBound;
	}
}
