package com.neu.q1;

import java.math.BigDecimal;

class Circle extends Shape {
	private double radius;
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
		this.perimeter = new BigDecimal(2*Math.PI*radius).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		this.area = new BigDecimal(Math.PI*radius*radius).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}