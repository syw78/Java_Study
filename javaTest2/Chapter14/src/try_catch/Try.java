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
			System.out.println("1.���α׷� �������Դϴ�.");
			}catch (Exception e) {
				result=array[9];
				System.out.println("2.���߾��"+result);
				throw new RuntimeException();
			}finally {
				System.out.println("3.���α׷� �� �Ϸ� �߽��ϴ�.");
			}
			System.out.println("4.��θ���"+result);
	}

	private static void testPrint()  {
		System.out.println("11.�Լ��� �����մϴ�.");
		int number=0;
		try {
		number=10/0;
		}catch(ArithmeticException e) {
			System.out.println("12 . ���α׷������Դϴ�.");
			throw new RuntimeException();
		}
		System.out.println("12.��°���="+number);
		System.out.println("13.���α׷�����");
	}
}
