package chapter02;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {

		// ������ ����ڷκ��� �Է¹޴¹��
		// 1. Scanner ��ü�� �����.
		// 2. ���ڿ�,nextLine���ڴܾ� next, ������nextInt, �Ǽ���nextDouble, �οﰪnextBoolean,
		Scanner seoScanner = new Scanner(System.in); // Ű���忡���� �Է����޴� ���Ǳ� ; Ű����κ��� �Է��Ҽ��ִ� ���Ǳ� ��ü�� ����ڴ� �� �̸��� ����ĳ��
		System.out.println("����� �̸��� �Է��ϼ��� :");
		String name = seoScanner.nextLine();
		System.out.println("����� �̸��� :" + name + "�Դϴ�.");
		System.out.println("����� ���̸� �Է��Ͻÿ�");
		int age=seoScanner.nextInt();
		System.out.println("����� �̸��� :" + name + "�Դϴ�.");
		System.out.println("����� ���̴� :" + age + "�Դϴ�.");
	}
}
