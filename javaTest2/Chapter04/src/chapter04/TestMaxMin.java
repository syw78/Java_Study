package chapter04;

import java.util.Arrays;

public class TestMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE = 10;

		int[] number = new int[SIZE];

		for (int i = 0; i < number.length; i++) {
			number[i] = (int) (Math.random() * (10 - 1 + 1) + 1);
		}
		int Max = searchMaxValue(number);
		System.out.println(Arrays.toString(number) + " ");
		System.out.println("�ִ밪=" + Max);

	}

	public static int searchMaxValue(int[] number) {
		int max = 0;
		max = number[0];
		for (int i = 0; i < number.length; i++) {
			if (max < number[i]) {
				max = number[i];
			}
		}
		return max;
	}

}
