package chapter03;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. �ΰ� ���� �Է¹޴´�.

		int n = 0;
		int k = 0;
		long fact1 = 1, fact2 = 1;
		Scanner scan = new Scanner(System.in);
		do {

			System.out.print("�ζ� ��ü�� ����");
			n = scan.nextInt();
			System.out.print("�ζ� ���� ���� ����");
			k = scan.nextInt();

		} while (n < 1 || n > 45 || k < 1 || k > 45);
		// 2. �ΰ��� ���� ������ ���հ�츦 ����Ѵ�.
		for (int i = 1; i <= k; i++) {
			fact1 = fact1 * (n - i + 1);
			fact2 = fact2 * (i);
		}
		System.out.println("�ζ��� Ȯ����" + (fact1 / fact2));

	}

}
