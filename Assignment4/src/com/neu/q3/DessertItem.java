package com.neu.q3;
abstract class DessertItem {
	public String name;
	
	public DessertItem() {
		
	}
	
	public DessertItem(String name) {
		this.name = name;
	}
	
	public final String getName() {
		return this.name;
	}
	
	public abstract int getCost();
}