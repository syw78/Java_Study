package chapter04;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc";
		String str2 = new String("abc");

		System.out.println("str1=" + str1);
		System.out.println("str2=" + str2);
		if (str1.equals(new String("abc"))) {
			System.out.println("�����ϴ�");
		} else {
			System.out.println("�ٸ��ϴ�.");
		}
	}

}
