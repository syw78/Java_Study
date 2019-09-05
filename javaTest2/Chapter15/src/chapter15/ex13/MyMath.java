package chapter15.ex13;

public class MyMath {
	// 1.멤버변수

	// 3.함수
	public static <T>double getAverage(T[] t) {
		double sum = 0.0;

		for (int i = 0; i < t.length; i++) {
			sum =sum + Double.parseDouble(t[i]+"");
		}
		return (sum/(double)t.length);
	}
}
