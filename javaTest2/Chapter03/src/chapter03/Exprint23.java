package chapter03;

import java.util.Scanner;

public class Exprint23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("원하는 연산을 입력하시오");
		Scanner scan = new Scanner(System.in);
		String result = scan.next();
		char charValue = result.charAt(0);
		System.out.print("원하는 숫자를 입력하세요");
		int a = scan.nextInt();
		System.out.print("원하는 숫자를 입력하세요");
		int b = scan.nextInt();

		for (;;) {
			if (charValue == '+') {
				System.out.println("덧셈 :" + a + b);
				break;
			} else if (charValue == '-') {
				System.out.println("뺄셈 :" + (a - b));
				break;
			} else if (charValue == '*') {
				System.out.println("곱셈 :" + (a * b));
				break;
			} else if (charValue == '/') {
				System.out.println("나눗셈 :" + (a / b));
				break;
			}
		}
	}

}
