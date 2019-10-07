package com.neu.q3;
class IceCream extends DessertItem  {
	public int cost;
	
	public IceCream() {
		
	}
	
	public IceCream(String name, int cost) {
		super(name);
		this.cost = cost;
	}

	@Override
	public int getCost() {
		return cost;
	}
	
	@Override
	public String toString() {
		return this.name + "\t" + DessertShop.cents2dollarsAndCentsmethod(getCost());
	}
	
}