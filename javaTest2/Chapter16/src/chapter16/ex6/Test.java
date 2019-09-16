package chapter16.ex6;

public class Test implements Runnable {

	public static void main(String[] args) {
		
		Test t = new Test();
		Thread t1= new Thread(t);
		t1.start();
	}

	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(i+" ");
		}
	}

}
