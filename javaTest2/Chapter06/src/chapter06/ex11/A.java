package chapter06.ex11;

public class A {

	public void sub() {
		Point p = new Point();
		p.x=10;
		p.y=20;
		System.out.println(p.x+" "+p.y);
		set(p);
		System.out.println(p.x+" "+p.y);
		
	}
	public void set(Point p) {
		
		p.x=30;
		p.y=40;
	}
}
