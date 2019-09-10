package chapter16.bakery;

public class BreadTest {

	public static void main(String[] args) {
		Bakery bakery = new Bakery();
		//1.생산자 스레드객체를 만듬.
		Runnable baker = new Baker(bakery);
		Thread th1 = new Thread(baker);
		
		//소비자 스레드객체 만듦
		Thread th2 = new Guest(bakery);
		//스레드 시작(Baker)
		th1.start();
		//스레드 시작(Guest 시작)
		th2.start();
	}

}
