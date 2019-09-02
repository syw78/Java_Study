package chapter04;

import java.util.Scanner;

public class HaxaToBinaryTest {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int number=0;
		String binaryString= null;
		//1. 16진수 문자열을 2진수문자열로 변환하는 프로그램 작성한다
		System.out.print("16진수 문자열 입력요망(4자리):");
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
