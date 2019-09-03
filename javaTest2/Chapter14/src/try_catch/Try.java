package try_catch;

public class Try {
	public static final int NO;
	static {
		NO = 10;
	}

	public static void main(String[] args) throws Exception{
		int result=0;
			int[] array = new int[NO];
			for(int i =0;i<NO;i++) {
				array[i]=i;
			}
		//	testPrint();
			try {
			result= array[12];
			System.out.println("1.프로그램 진행중입니다.");
			}catch (Exception e) {
				result=array[9];
				System.out.println("2.잘했어요"+result);
				throw new RuntimeException();
			}finally {
				System.out.println("3.프로그램 잘 완료 했습니다.");
			}
			System.out.println("4.배부르다"+result);
	}

	private static void testPrint()  {
		System.out.println("11.함수를 실행합니다.");
		int number=0;
		try {
		number=10/0;
		}catch(ArithmeticException e) {
			System.out.println("12 . 프로그램오류입니다.");
			throw new RuntimeException();
		}
		System.out.println("12.출력값은="+number);
		System.out.println("13.프로그램종료");
	}
}
