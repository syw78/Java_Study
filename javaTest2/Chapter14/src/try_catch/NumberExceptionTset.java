package try_catch;

public class NumberExceptionTset {

	public static void main(String[] args) {
		int number=0;
		System.out.println("1.���ڰ���մϴ�.");
		try {
			 number=10/3;  //��üũ����
		}catch(ArithmeticException e){
			number=10/1;
		}
		System.out.println("������� ����մϴ�="+number);
	}

}
