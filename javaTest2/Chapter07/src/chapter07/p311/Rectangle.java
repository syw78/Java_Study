package chapter07.p311;

public class Rectangle extends Shape {

	private int width;
	private int height;
	private int volume;
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public double area() {
		
		this.volume=width*height;
		
		return this.volume;
	}
	public void draw() {
		
		System.out.println("( "+this.getX()+" , "+this.getY()+" ) "+"��ġ��"+"����: "+this.width+" ����: "+this.height);
	}
	
}