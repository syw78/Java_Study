package chapter03;

public class Exprint6_3 {

	public static void main(String[] args) {
		int i = 0, sum = 0;
		while (i < 10) {
			sum += i++;
			if (i % 3 == 0)
				continue;
			System.out.println("i=" + i);
			if (sum > 10)
				break;
		}
	}

}
