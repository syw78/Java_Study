package chapter05.ex17;

import java.util.Scanner;

public class Reverse {

	private String str;
	private String reverse;
	private String result;

	public Reverse() {
		str = null;
		reverse = null;
		result = null;
	}

	public void inputString() {

		Scanner scan = new Scanner(System.in);

		System.out.print("�������� ����ϰ���� ���ڸ� �Է��ϼ���");
		str = scan.nextLine();
	}

	public void print() {

		for (int i = str.length(); i > 0; i--) {
			reverse = reverse + str.charAt(i - 1);
		}
		result = reverse.substring(4);
		System.out.println(result);
	}
}
