package chapter14.ex14;

public class MyExceptionTest {
	public static void checkNegative(int number)throws MyException{
		if(number<0) {
			System.out.println(new MyException("음수는 안됩니다."));
		}else {
			System.out.println("다행히 음수가 아니군요");
		}
	}
	public static void main(String[] args) {
		try {
			checkNegative(1);
			checkNegative(-1);
		}catch(MyException ex){
			{
				ex.printStackTrace();
			}
		}
	}

}
