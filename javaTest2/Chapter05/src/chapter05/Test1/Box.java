package chapter05.Test1;

public class Box {

	//1������� �����
	//2�������Լ� �����
	//3����Լ��� �����
	
	private int wihth;
	private int length;
	private int height;
	private int volume;
	
	public Box() {
		wihth=0;
		length=0;
		height=0;
		volume=0;
	}
	
	public void setwihth(int wihth) {
		this.wihth=wihth;
	}
	public void setlength(int length) {
		this.length=length;
	}
	public void setheight(int height) {
		this.height=height;
	}
	public int getwihth() {
		return wihth;
	}
	public int getlength() {
		return length;
	}
	public int getheight() {
		return height;
	}
	
	public int boxVolume() {
		
		volume=wihth*length*height;
		
		return volume;
	}
	
	
	
	
	
}
