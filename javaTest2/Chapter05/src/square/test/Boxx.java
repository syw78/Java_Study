package square.test;

public class Boxx {

	//멤버변수
	//생성자함수
	//멤버함수
	
	private int width;
	private int height;
	private int length;
	private int volume;
	
	public Boxx() {
		width=0;
		height=0;
		length=0;
		volume=0;
	}
	
	public void setwidth(int a) {
		this.width=a;
	}
	public void setheight(int b) {
		this.height=b;
	}
	public void setlength(int c) {
		this.length=c;
	}
	public int getwidth() {
		return width;
	}
	public int getheight() {
		return height;
	}public int getlength() {
		return length;
	}
	public int volumeValue() {
		volume=width*height*length;
		
		return volume;
	}
}
