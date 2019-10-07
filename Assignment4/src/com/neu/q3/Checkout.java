package com.neu.q3;

import java.util.ArrayList;
import java.util.List;

class Checkout {
	private List<DessertItem> items;
	
	public Checkout() {
		this.items = new ArrayList<DessertItem>();
	}
	
	public int numberOfItems() {
		return items.size();
	}
	
	public void enterItem(DessertItem item) {
		items.add(item);
	}
	
	public void clear() {
		items =  new ArrayList<DessertItem>();
	}
	
	public int totalCost() {
		int totalPrice = 0;
		for(DessertItem item : items) {
			totalPrice += item.getCost();
		}
		return totalPrice;
	}
	
	public int totalTax() {
		return (int)Math.round(this.totalCost() * DessertShop.TAX_RATE);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\t").append(DessertShop.STORE_NAME).append("\n").append("\t").append("--------------------\n");
		for(DessertItem item : items) {
			sb.append(item).append("\n");
		}
		
		sb.append("Tax\t").append(DessertShop.cents2dollarsAndCentsmethod(totalTax())).append("\n");
		sb.append("Total Cost").append("\t").append(DessertShop.cents2dollarsAndCentsmethod(totalCost() + totalTax())).append("\n");
		
		return sb.toString();
	}
}