package chapter14.ex06;

public class Test {

	public static void main(String[] args) {
		try {
			int n= Integer.parseInt("abc");
			System.out.println("try");
		}catch(NumberFormatException e) {
			System.out.println("숫자 형식 오류");
		}finally {
			System.out.println("finally");
		}
		
	}

}
