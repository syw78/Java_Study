package chapter07.ex8;

public class Circle {
	private double radius;
	private String color;
	public final double PI=3.141592;
	public Circle() {
		super();
	}
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	public double getArea() {
		return PI*radius*radius;
	}
	
}
