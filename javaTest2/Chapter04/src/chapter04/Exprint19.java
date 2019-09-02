package chapter04;

public class Exprint19 {

	public static void main(String[] args) {

		final int SIZE = 10;
		int[] num = new int[SIZE];

		for (int i = 0; i < SIZE; i++) {
			num[i] = (int) (Math.random() * (100 - 1 + 1) + 1);
			if (num[i] >= 1 && num[i] <= 10)
				++num[0];
			else if (num[i] >= 11 && num[i] <= 20)
				++num[1];
			else if (num[i] >= 21 && num[i] <= 30)
				++num[2];
			else if (num[i] >= 31 && num[i] <= 40)
				++num[3];
			else if (num[i] >= 41 && num[i] <= 50)
				++num[4];
			else if (num[i] >= 51 && num[i] <= 60)
				++num[5];
			else if (num[i] >= 61 && num[i] <= 70)
				++num[6];
			else if (num[i] >= 71 && num[i] <= 80)
				++num[7];
			else if (num[i] >= 81 && num[i] <= 90)
				++num[8];
			else if (num[i] >= 91 && num[i] <= 100)
				++num[9];
		}
		for (int i = 0; i < SIZE; i++) {
			System.out.print((i * 10 + 1) + "-" + (i * 10 + 10) + " ");
			for (int j = 0; j < num[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
