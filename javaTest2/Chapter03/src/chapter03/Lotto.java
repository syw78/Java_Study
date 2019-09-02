package chapter03;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 두개 수를 입력받는다.

		int n = 0;
		int k = 0;
		long fact1 = 1, fact2 = 1;
		Scanner scan = new Scanner(System.in);
		do {

			System.out.print("로또 전체수 갯수");
			n = scan.nextInt();
			System.out.print("로또 복권 선택 갯수");
			k = scan.nextInt();

		} while (n < 1 || n > 45 || k < 1 || k > 45);
		// 2. 두개의 수를 가지고 조합경우를 계산한다.
		for (int i = 1; i <= k; i++) {
			fact1 = fact1 * (n - i + 1);
			fact2 = fact2 * (i);
		}
		System.out.println("로또의 확률은" + (fact1 / fact2));

	}

}
