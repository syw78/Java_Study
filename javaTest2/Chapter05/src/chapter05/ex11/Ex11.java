package chapter05.ex11;

public class Ex11 {

	public static void main(String[] args) {
		String x = "abc";
		String a=x.toUpperCase(); //�ҹ��ڸ� �빮�ڷ� �ٲ��ִ� �Լ�.
		String y = a.replace('A', 'd'); //��ü�ϴ�
		y = y + "xyz";
		System.out.println(y);
	}
}
