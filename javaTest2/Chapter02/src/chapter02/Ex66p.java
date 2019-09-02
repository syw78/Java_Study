package chapter02;

public class Ex66p {

	public static void main(String[] args) {

		double radius = 0.0;
		double area = 0.0;
		radius = 5;
		area = radius * radius * 3.141592;

		System.out.println("면적" + area + "반지름" + radius);
		System.out.printf("면적 %.4f 반지름 %.1f", area, radius);

	}

}
