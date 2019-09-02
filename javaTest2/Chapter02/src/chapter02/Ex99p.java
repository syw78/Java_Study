package chapter02;

import java.util.Scanner;

public class Ex99p {

	public static void main(String[] args) {
		double w = 0.0;
		double h = 0.0;
		double area = 0.0;
		double premeter = 0.0;

		Scanner input = new Scanner(System.in);

		System.out.print("사각형의 가로를 입력하시오 :");
		w = input.nextDouble();

		System.out.print("사각형의 세로를 입력하시오 :");
		h = input.nextDouble();

		area = w * h;
		premeter = 2.0 * (w + h);

		System.out.println("사각형의 넓이는 " + area);
		System.out.println("사각형의 둘레는 " + premeter);

	}

}
