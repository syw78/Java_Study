package chapter02;

import java.util.Scanner;

public class Ex99p {

	public static void main(String[] args) {
		double w = 0.0;
		double h = 0.0;
		double area = 0.0;
		double premeter = 0.0;

		Scanner input = new Scanner(System.in);

		System.out.print("�簢���� ���θ� �Է��Ͻÿ� :");
		w = input.nextDouble();

		System.out.print("�簢���� ���θ� �Է��Ͻÿ� :");
		h = input.nextDouble();

		area = w * h;
		premeter = 2.0 * (w + h);

		System.out.println("�簢���� ���̴� " + area);
		System.out.println("�簢���� �ѷ��� " + premeter);

	}

}
