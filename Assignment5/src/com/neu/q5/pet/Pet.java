package com.neu.q5.pet;

public class Pet {

	public static final int MALE = 1;
	public static final int FEMALE = 2;
	public static final int SPAYED = 3;
	public static final int NEUTERED = 4;
	
	private String name;
	private String ownerName;
	private String color;
	protected int sex;
	
	
	public Pet(String name, String ownerName, String color) {
		this.name = name;
		this.ownerName = ownerName;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getColor() {
		return color;
	}

	/**
	 * default sex will be set to "Male"
	 * @return
	 */
	public String getSex() {
		switch(this.sex) {
			case MALE : 
				return "Male";
			case FEMALE: 
				return "Female";
			case SPAYED : 
				return "Spayed";
			case NEUTERED: 
				return "Neutered";
			default:
				return "Male";
		}
	}

	public void setSex(int sexid) {
		this.sex = sexid;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.name).append(" owned by ").append(this.ownerName).append("\n");
		sb.append("Color: ").append(this.color).append("\n");
		sb.append("Sex: ").append(getSex());
		return sb.toString();
	}
	
}
