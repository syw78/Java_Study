package chapter07.ex10;

public class Triangle extends Shape {
	private int length;
	private int area;
	
	public int getLength() {
		return super.getHeight()+super.getWidth();
	}
	public int getArea() {
		return super.getHeight()*super.getWidth();
		
	}

	
	public Triangle(int width, int height, int length, int area) {
		super(width, height);
		this.length = length;
		this.area = area;
	}
	@Override
	public String toString() {
		return "Triangle [length=" + length + ", area=" + area + "]";
	}

}
