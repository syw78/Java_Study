package chapter03;

import java.util.Scanner;

public class munja {

	public static void main(String[] args) {
		System.out.println("알파벳을 입력하세요");
		Scanner scan=new Scanner(System.in);
		String string =scan.next();
		char charValue =string.charAt(0);
		System.out.println(charValue);
	}

}
