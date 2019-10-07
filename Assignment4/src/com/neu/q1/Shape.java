package com.neu.q1;
class Shape {
	protected String name;
	protected double perimeter;
	protected double area;
	
	public void draw() {
		System.out.println("Drawing Shape");
	}
	
	public double getArea() {
		System.out.println(this.area);
		return this.area;
	}
	
	public double getPerimeter() {
		System.out.println(this.perimeter);
		return this.perimeter;
	}
}