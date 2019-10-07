package com.neu.q1;
class Square extends Shape {
	private double side;
	
	public Square() {
		
	}
	
	public Square(double side) {
		this.side = side;
		this.perimeter = 4*side;
		this.area = side*side;
	}
	
	public void draw() {
		System.out.println("Drawing Square");
	}
}