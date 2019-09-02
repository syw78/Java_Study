package chapter05.ex3;

public class Rectangle {
	private int width;
	private int height;
	private int result;
	public Rectangle() {
		
		width=0;
		height=0;
	}
	
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

	public int area() {
		result=width*height;
		return result;
	}
}
