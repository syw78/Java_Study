package chapter03;

import java.util.Scanner;

public class Exprint12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int top = 0;
		int mid = 0;
		int bot = 0;

		System.out.print("������ �Է��Ͻÿ� :");
		int num = scan.nextInt();
		System.out.print("������ �Է��Ͻÿ� :");
		int num2 = scan.nextInt();
		System.out.print("������ �Է��Ͻÿ� :");
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
		System.out.println("���ĵ� ���� : " + bot + " " + mid + " " + top);
	}
}
