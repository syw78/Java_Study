package chapter14.ex06;

public class Test {

	public static void main(String[] args) {
		try {
			int n= Integer.parseInt("abc");
			System.out.println("try");
		}catch(NumberFormatException e) {
			System.out.println("���� ���� ����");
		}finally {
			System.out.println("finally");
		}
		
	}

}
