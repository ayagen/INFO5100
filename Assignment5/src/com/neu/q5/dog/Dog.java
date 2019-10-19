package com.neu.q5.dog;

import java.util.Calendar;

import com.neu.q5.boardable.Boardable;
import com.neu.q5.pet.Pet;

public class Dog extends Pet implements Boardable {
	
	private String size;
	
	private Calendar boardingStart;
	
	private Calendar boardingEnd;
	
	public Dog (String name, String ownerName, String color, String size) {
		super(name, ownerName, color);
		this.size = size;
	}

	public String getSize() {
		return this.size;
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

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("DOG:").append("\n");
		sb.append(super.toString()).append("\n");
		sb.append("Size: ").append(this.size);
		return sb.toString();
	}
}
