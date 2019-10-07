package com.neu.q3;
class Sundae extends IceCream  {
	private String topingName;
	private int topingCents;
	public Sundae() {
		
	}
	
	public Sundae(String name, int cents, String topingName, int topingCents) {
		super(name, cents);
		this.topingName = topingName;
		this.topingCents = topingCents;
	}
	
	@Override
	public int getCost() {
		return cost + topingCents;
	}
	
	@Override
	public String toString() {
		String printName = DessertShop.formatAccordingLength(this.topingName + " Sundae with " + this.name);
		
		return printName + "\t" + DessertShop.cents2dollarsAndCentsmethod(getCost());
	}
}