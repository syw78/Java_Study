package chapter03;

import java.util.Scanner;

public class Exprint12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int top = 0;
		int mid = 0;
		int bot = 0;

		System.out.print("정수를 입력하시오 :");
		int num = scan.nextInt();
		System.out.print("정수를 입력하시오 :");
		int num2 = scan.nextInt();
		System.out.print("정수를 입력하시오 :");
		int num3 = scan.nextInt();

		if (num > num2 && num > num3) {
			top = num;
			if (num2 > num3) {
				mid = num2;
				bot = num3;
			} else if (num3 > num2) {
				mid = num3;
				bot = num2;
			}
		}
		if (num2 > num && num2 > num3) {
			top = num2;
			if (num > num3) {
				mid = num;
				bot = num3;
			} else if (num3 > num) {
				mid = num3;
				bot = num;
			}
		}
		if (num3 > num && num3 > num2) {
			top = num3;
			if (num > num2) {
				mid = num;
				bot = num2;
			} else if (num2 > num) {
				mid = num2;
				bot = num;
			}
		}
		System.out.println("정렬된 숫자 : " + bot + " " + mid + " " + top);
	}
}
