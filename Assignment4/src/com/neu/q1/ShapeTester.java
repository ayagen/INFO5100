package com.neu.q1;

public class ShapeTester {
	// Main operation class for testing
	public static void main(String args[]) {
		Shape s = new Shape();
		Rectangle r = new Rectangle(2.0, 3.0);
		Circle c = new Circle(4.0);
		Square sq = new Square(4.0);
		r.getArea(); // should print 6.0
		r.getPerimeter();//should print 10.0
		c.getArea(); //should print 50.26  
		c.getPerimeter();
		sq.getArea();
		sq.getPerimeter();// should print 16.0
		r.draw();
		c.draw();
		s.draw();
		sq.draw();
	}
}
