package chapter02;

import java.util.Scanner;

public class Ex97p {

	public static void main(String[] args) {
		double radius = 0.0;
		double area = 0.0;
		final double PI = 3.14;

		Scanner input = new Scanner(System.in);

		System.out.print("반지름을 입력하시오");
		radius = input.nextDouble();

		area = PI * radius * radius;

		System.out.println("원의 면적은 " + area);
	}

}
