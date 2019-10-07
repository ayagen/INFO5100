package com.neu.q1;
class Rectangle extends Shape {
	private double width;
	private double height;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(double height, double width) {
		this.width = width;
		this.height = height;
		this.area = this.width * this.height;
		this.perimeter = 2*(this.width + this.height);
	}
	
	
	public void draw() {
		System.out.println("Drawing rectangle");
	}
	
}