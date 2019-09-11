package chapter16.ex7;

public class Test {
	private int count=1;
	
	public synchronized void sub() {
		for(int i=0;i<10;i++) {
			System.out.println(count++);
		}
	}
	public static void main(String[] args) {
		Test t = new Test();
		Thread a1= new A(t);
		Thread a2 = new A(t);
		a1.start();
		a2.start();
		
	}
}
	class A extends Thread{
		Test demo;
		
		public A(Test t) {
			demo = t;
		}
		public void run() {
			demo.sub();
		}
	}


