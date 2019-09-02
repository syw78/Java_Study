package chapter03;

import java.util.Scanner;

public class Exprint14 {

	public static void main(String[] args) {
		
		System.out.print("알파벳을 입력하세요");
		Scanner scan=new Scanner(System.in);
		String string =scan.next();
		char charValue =string.charAt(0);
		System.out.print(charValue);
		
		switch(charValue)
		{
		case 'A': case'a':
			System.out.println("모음입니다"); break;
		case 'E': case 'e':
			System.out.println("모음입니다"); break;
		case 'I': case 'i':
			System.out.println("모음입니다"); break;
		case 'O': case 'o':
			System.out.println("모음입니다"); break;
		case 'U': case 'u':
			System.out.println("모음입니다"); break;
		default :
			System.out.println("자음입니다"); break;
		}
	
	}

}
