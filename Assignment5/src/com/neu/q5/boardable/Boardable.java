package com.neu.q5.boardable;

public interface Boardable {
	void setBoardStart(int month, int day, int year); 
	void setBoardEnd(int month, int day, int year); 
	boolean boarding(int month, int day, int year); 
}
