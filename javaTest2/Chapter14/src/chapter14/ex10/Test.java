package chapter14.ex10;

public class Test {

	public static void main(String[] args) {
		try {
			int x=0;
			int y=5/x;
		}catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception"); //Arithmetic ���
			System.out.println("finished");
		}catch(Exception e) {
			System.out.println("Exception"); //ū�Ŵ� ������ �� ������ �;���
	}

}
	}
