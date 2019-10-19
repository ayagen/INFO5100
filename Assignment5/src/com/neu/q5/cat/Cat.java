package com.neu.q5.cat;

import java.util.Calendar;

import com.neu.q5.boardable.Boardable;
import com.neu.q5.pet.Pet;

public class Cat extends Pet implements Boardable {

	private String hairLength;
	
	private Calendar boardingStart;
	
	private Calendar boardingEnd;
	
	public Cat(String name, String ownerName, String color, String hairLength) {
		super(name, ownerName, color);
		this.hairLength = hairLength;
	}
	
	

	@Override
	public void setBoardStart(int month, int day, int year) {
		boardingStart = Calendar.getInstance();
		boardingStart.set(year, month, day);
	}

	@Override
	public void setBoardEnd(int month, int day, int year) {
		boardingEnd = Calendar.getInstance();
		boardingEnd.set(year, month, day);
	}

	@Override
	public boolean boarding(int month, int day, int year) {
		Calendar current = Calendar.getInstance();
		current.set(year, month, day);
		
		if(current.equals(boardingStart) || current.equals(boardingEnd)) {
			return true;
		}
		if(current.before(boardingEnd) && current.after(boardingStart)) {
			return true;
		}
		return false;
	}
	
	public String getHairLength() {
		return hairLength;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("CAT:").append("\n");
		sb.append(super.toString()).append("\n");
		sb.append("Hair: ").append(this.hairLength);
		return sb.toString();
	}


}
