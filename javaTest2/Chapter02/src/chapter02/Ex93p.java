package chapter02;

import java.util.Scanner;

public class Ex93p {

	public static void main(String[] args) {

		String name = null;
		int age = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("�̸��� �Է����ּ��� ");
		name = input.nextLine();

		System.out.print("���̸� �Է��ϼ���  :");
		age = input.nextInt();

		System.out.print(name + "�� �ȳ��ϼ���!" + age + ("�� �̽ó׿�!"));

	}

}
