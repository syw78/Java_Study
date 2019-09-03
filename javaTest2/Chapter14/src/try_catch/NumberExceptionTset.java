package try_catch;

public class NumberExceptionTset {

	public static void main(String[] args) {
		int number=0;
		System.out.println("1.숫자계산합니다.");
		try {
			 number=10/3;  //비체크예외
		}catch(ArithmeticException e){
			number=10/1;
		}
		System.out.println("결과값을 출력합니다="+number);
	}

}
