package chapter06.ex22;

public class Circle {
	public final static double PI = 3.141592;
	private double r;
	private int cx;
	private int cy;

	public Circle() {
		r = 0.0;
		cx = 0;
		cy = 0;
	}


	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public int getCx() {
		return cx;
	}

	public void setCx(int cx) {
		this.cx = cx;
	}

	public int getCy() {
		return cy;
	}

	public void setCy(int cy) {
		this.cy = cy;
	}
	public double area() {
		return PI * this.r * this.r;
	}

}
