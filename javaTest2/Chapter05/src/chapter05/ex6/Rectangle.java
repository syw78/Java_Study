package chapter05.ex6;

public class Rectangle {
	private int width;
	private int height;
	private int area;
	private int perimeter;
	
	public Rectangle() {
		width=0;
		height=0;
		area=0;
		perimeter=0;
	}
	public Rectangle(int width,int height) {
		
		this.width=width;
		this.height=height;
	}
	
	public int area() {
		area=width*height;
		return area;
	}
	public int perimeter() {
		perimeter=width+width+height+height;
		return perimeter;
	}
	
}
