package chapter14.ex09;

public class Test {

	public static void main(String[] args) {
		try {
			someMethod();
			System.out.println("A");
		}catch(Exception e) {
			System.out.println("B"); // ������ ���� ������ 
		}finally {						//catch �� �ۿ��� ���ؼ� A C D �� ��µȴ�	
			System.out.println("C");
		}
		System.out.println("D");
	}
	public static void someMethod() {}
}
