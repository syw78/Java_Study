package chapter02;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {

		// 문장을 사용자로부터 입력받는방법
		// 1. Scanner 객체를 만든다.
		// 2. 문자열,nextLine문자단어 next, 정수값nextInt, 실수값nextDouble, 부울값nextBoolean,
		Scanner seoScanner = new Scanner(System.in); // 키보드에서만 입력을받는 자판기 ; 키보드로부터 입력할수있는 자판기 객체를 만들겠다 그 이름은 서스캐너
		System.out.println("당신의 이름을 입력하세요 :");
		String name = seoScanner.nextLine();
		System.out.println("당신의 이름은 :" + name + "입니다.");
		System.out.println("당신의 나이를 입력하시오");
		int age=seoScanner.nextInt();
		System.out.println("당신의 이름은 :" + name + "입니다.");
		System.out.println("당신의 나이는 :" + age + "입니다.");
	}
}
