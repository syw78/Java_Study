package chapter03;

import java.util.Scanner;

public class Exprint14 {

	public static void main(String[] args) {
		
		System.out.print("���ĺ��� �Է��ϼ���");
		Scanner scan=new Scanner(System.in);
		String string =scan.next();
		char charValue =string.charAt(0);
		System.out.print(charValue);
		
		switch(charValue)
		{
		case 'A': case'a':
			System.out.println("�����Դϴ�"); break;
		case 'E': case 'e':
			System.out.println("�����Դϴ�"); break;
		case 'I': case 'i':
			System.out.println("�����Դϴ�"); break;
		case 'O': case 'o':
			System.out.println("�����Դϴ�"); break;
		case 'U': case 'u':
			System.out.println("�����Դϴ�"); break;
		default :
			System.out.println("�����Դϴ�"); break;
		}
	
	}

}
