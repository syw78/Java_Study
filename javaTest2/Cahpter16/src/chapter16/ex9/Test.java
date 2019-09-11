package chapter16.ex9;

public class Test {

	public static void main(String[] args) {
	    Thread t = new Thread(new MyJob());
        t.start();
		t.interrupt();
	}

}
