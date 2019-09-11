package chapter16.ex8;

public class Test {

	public static void main(String[] args) {
		Thread t1 = new Job("run");
		Thread t2 = new Job("run");
		t1.start();
		System.out.println("============");
		t2.start();
	}

}
