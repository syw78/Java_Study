package chapter02;

import java.util.Scanner;

public class Ex97p {

	public static void main(String[] args) {
		double radius = 0.0;
		double area = 0.0;
		final double PI = 3.14;

		Scanner input = new Scanner(System.in);

		System.out.print("�������� �Է��Ͻÿ�");
		radius = input.nextDouble();

		area = PI * radius * radius;

		System.out.println("���� ������ " + area);
	}

}
