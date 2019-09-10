package chapter16.bakery;

public class BreadTest {

	public static void main(String[] args) {
		Bakery bakery = new Bakery();
		//1.������ �����尴ü�� ����.
		Runnable baker = new Baker(bakery);
		Thread th1 = new Thread(baker);
		
		//�Һ��� �����尴ü ����
		Thread th2 = new Guest(bakery);
		//������ ����(Baker)
		th1.start();
		//������ ����(Guest ����)
		th2.start();
	}

}
