package chapter03;

import java.util.Scanner;

public class Exprint23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("���ϴ� ������ �Է��Ͻÿ�");
		Scanner scan = new Scanner(System.in);
		String result = scan.next();
		char charValue = result.charAt(0);
		System.out.print("���ϴ� ���ڸ� �Է��ϼ���");
		int a = scan.nextInt();
		System.out.print("���ϴ� ���ڸ� �Է��ϼ���");
		int b = scan.nextInt();

		for (;;) {
			if (charValue == '+') {
				System.out.println("���� :" + a + b);
				break;
			} else if (charValue == '-') {
				System.out.println("���� :" + (a - b));
				break;
			} else if (charValue == '*') {
				System.out.println("���� :" + (a * b));
				break;
			} else if (charValue == '/') {
				System.out.println("������ :" + (a / b));
				break;
			}
		}
	}

}
