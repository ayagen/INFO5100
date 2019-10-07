package com.neu.q3;
class Candy extends DessertItem {
	
	public double weight;
	public int centsPerPound;
	
	public Candy() {
		
	}
	
	public Candy(String name, double weight,  int centsPerPound) {
		super(name);
		this.centsPerPound = centsPerPound;
		this.weight = weight;
	}

	@Override
	public int getCost() {
		return (int)Math.round(this.weight * this.centsPerPound);
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.weight).append(" lbs. @ ").append(DessertShop.cents2dollarsAndCentsmethod(this.centsPerPound)).append(" /lb.\n");
		sb.append(this.name).append("\t").append(DessertShop.cents2dollarsAndCentsmethod(getCost())).append("\n");
		return sb.toString();
	}
}