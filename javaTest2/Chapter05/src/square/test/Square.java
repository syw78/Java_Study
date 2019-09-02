package square.test;

public class Square {
	
	private int height;
	private int width;
	private int distance; //인스턴스멤버변수
	private int area;
	
	public Square() {
		height=0;
		width=0;				//생성자함수
		distance=0;
		area=0;
	}
	
	public void setheight(int a) {
		this.height=a;
	}
	public void setwidth(int b) { //인스턴스멤버함수
		this.width=b;
	}
	public int getheight() {
		return height;
	}
	public int getwidth() {
		return width;
	}
	
	public int squareDis() {
		distance=height+height+width+width; //인스턴스멤버함수
		
		return distance;
	}
	public int squareArea() {
		area=height*width;
		return area;
	}
}
