package chapter09.ex6;

public class Rectangle implements GraphicsObject {
	private int length;
	private int width;
	
	public void setDimensions(int l , int w) {
		this.length=l;
		this.width=w;
	}
	public int getArea() {
		
		return length*width;
	}
	public void draw() {
		System.out.println("도형을 그린다.");
	}
}
