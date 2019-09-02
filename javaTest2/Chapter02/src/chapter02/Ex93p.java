package chapter02;

import java.util.Scanner;

public class Ex93p {

	public static void main(String[] args) {

		String name = null;
		int age = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("이름을 입력해주세요 ");
		name = input.nextLine();

		System.out.print("나이를 입력하세요  :");
		age = input.nextInt();

		System.out.print(name + "님 안녕하세요!" + age + ("살 이시네요!"));

	}

}
