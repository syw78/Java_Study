package chapter04;

public class ForEach {
	// 1.멤버변수
	private int[] numbers;

	// 2.생성자함수
	public ForEach() {
		this.numbers = new int[] { 10, 20, 30 };
	}

	public ForEach(int[] numbers) {
		this.numbers = numbers;
	}

	// 3.멤버함수
	public void generalFor() {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("\t" + numbers[i]);
		}

	}

	public void improveFor() {
		for (int number : numbers) {

			System.out.print("\t" + number);
		}
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
}
