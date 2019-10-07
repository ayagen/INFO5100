package com.neu.q3;
class Cookie extends DessertItem  {
	public int number;
	public int centsPerDozen;
	
	public Cookie() {
		
	}
	
	public Cookie(String name, int number, int centsPerDozen) {
		this.name = name;
		this.number = number;
		this.centsPerDozen = centsPerDozen;
	}
	
	@Override
	public int getCost() {
		return (int)Math.round(centsPerDozen * number/12);
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.number).append(" @ ").append(DessertShop.cents2dollarsAndCentsmethod(this.centsPerDozen)).append(" /dz.\n");
		sb.append(this.name).append("\t").append(DessertShop.cents2dollarsAndCentsmethod(getCost())).append("\n");
		return sb.toString();
	}
}