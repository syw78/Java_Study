package chapter02;

import java.util.Scanner;

public class Ex92p {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int sum = 0;

		System.out.print("ù��° ���ڸ� �Է��ϼ���");
		x = input.nextInt();

		System.out.print("�ι�° ���ڸ� �Է��ϼ���");
		y = input.nextInt();

		sum = x + y;

		System.out.println(sum);

	}

}
