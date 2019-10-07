package com.neu.q3;

import java.math.BigDecimal;

class DessertShop {
	public static final double TAX_RATE = 0.065;
	public static final String STORE_NAME = "M & M Dessert Shop";
	public static final int MAX_LENGTH_ITEM_NAME = 25;
	public static final int DISPLAY_WIDTH_FOR_COSTS = 80;
	
	public static String cents2dollarsAndCentsmethod (int cents) {
		return new BigDecimal((double)cents/100).setScale(2, BigDecimal.ROUND_HALF_UP).toString();
	}
	
	public static String formatAccordingLength(String data) {
		if(data == null || data.length() == 0) {
			return data;
		}
		String newData = "";
		if(data.length() > MAX_LENGTH_ITEM_NAME) {
			String[] words = data.split(" ");
			int currentLength = 0;
			for(String item : words) {
				currentLength += item.length();
				if(currentLength < MAX_LENGTH_ITEM_NAME) {
					newData += item + " ";
					currentLength++;
				} else {
					newData += "\n" + item;
					currentLength = item.length();
				}
			}
		}
		return newData;
	}
}