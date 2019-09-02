package chapter04;

public class HistoProgram {
	public static final int COUNT = 100;

	public static void main(String[] args) {
		int[] countArray = new int[10];
		int randomNumber = 0;
		// 1. 입력값의 분포를 시각적으로 볼수 있도록 히스토그램 만들어라.
		// 2. 1과 100사이의 정수 10개를 읽어야한다.(어디서 읽어야 된단 말인가~)
		// 3. 1~10, 11~20, ..., 91~100 범위에 드는 값들의 횟수를 읽어라.(배열처리할것)

		for (int i = 0; i < COUNT; i++) {
			randomNumber = (int) (Math.random() * (100 - 1 + 1) + 1);
			if (randomNumber % 10 == 0) {
				countArray[(int) randomNumber / 10 - 1]++;

			} else {
				countArray[(int) randomNumber / 10]++;
			}
		}
		for (int i = 0; i < countArray.length; i++) {
			System.out.printf("%d ~ %d=", (i * 10 + 1), (i + 1) * 10);
			for (int j = 0; j < countArray[i]; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}
}
