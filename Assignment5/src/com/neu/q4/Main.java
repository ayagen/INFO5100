package com.neu.q4;

public class Main {
	
	public static void main(String[] args) {
		
		Exception exception = new MyIndexOutOfBoundException(0, 10, 11);
		System.out.println(exception.toString());
	}
}
