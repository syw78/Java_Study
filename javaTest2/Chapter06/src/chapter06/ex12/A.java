package chapter06.ex12;

public class A {
	private int x;
	private int s;
	
	public A() {
		x=0;
		s=0;
	}
	
	public void sub() {
		this.x=5;
		setDouble(x);
		System.out.print(x+" ");
		System.out.println(s);
	}
	public void setDouble(int x) {
		x=x*2;
		s=x;
	}
}
