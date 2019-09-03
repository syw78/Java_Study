package chapter14.ex3;

public class Test {

	public static void main(String[] args) {
		try {
			System.out.println("오류확인");
		} finally {
			System.out.println("이상 무");
		} //반드시 자원을 반납해야 하는상황  오류가 나면 자원을 반드시반납해야
		 //할때 사용한다.
	}

}
