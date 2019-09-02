package chapter09.ex10;

public class MyClass {
	private int a;
	protected int b;
	int c;
	
		class MyInner{
			int d;
			
			public void m() {
				d=10;
				c=10;
				b=10;
				a=10;
				
			}
		}
}
