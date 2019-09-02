package chapter02;

import java.util.Scanner;

public class Ex92p {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int sum = 0;

		System.out.print("첫번째 숫자를 입력하세요");
		x = input.nextInt();

		System.out.print("두번째 숫자를 입력하세요");
		y = input.nextInt();

		sum = x + y;

		System.out.println(sum);

	}

}
