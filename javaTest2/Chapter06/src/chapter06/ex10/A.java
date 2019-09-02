package chapter06.ex10;

public class A {
	private boolean b1;
	
	public A() {
		
		this.b1=false;
	}
	
	public void sub() {
		
		System.out.println(this.b1);
		set(this.b1);
		System.out.println(this.b1);
	}
	public void set(boolean b1) {
		
		this.b1=true;
	}
	
}
