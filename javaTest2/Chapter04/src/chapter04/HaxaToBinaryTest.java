package chapter04;

import java.util.Scanner;

public class HaxaToBinaryTest {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int number=0;
		String binaryString= null;
		//1. 16���� ���ڿ��� 2�������ڿ��� ��ȯ�ϴ� ���α׷� �ۼ��Ѵ�
		System.out.print("16���� ���ڿ� �Է¿��(4�ڸ�):");
		String hexValue=scan.nextLine();
		for(int i=0;i<hexValue.length();i++) {
			char charValue=hexValue.charAt(i);
			if(charValue>='0'&&charValue<='9') {
				number= charValue - '0';
			}else if(charValue>='a'&&charValue<='f') {
				number= charValue-'a'+10;
			}
			binaryString=toBinartString(number);
			System.out.print(binaryString+" ");
		}
	}
	public static String toBinartString(int number) {
		String str= null;
		str=Integer.toBinaryString(number);
		while(str.length()<4) {
			str="0"+str;
		}
		return str;
			
	}

}
