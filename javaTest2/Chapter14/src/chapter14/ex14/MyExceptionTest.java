package chapter14.ex14;

public class MyExceptionTest {
	public static void checkNegative(int number)throws MyException{
		if(number<0) {
			System.out.println(new MyException("������ �ȵ˴ϴ�."));
		}else {
			System.out.println("������ ������ �ƴϱ���");
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
