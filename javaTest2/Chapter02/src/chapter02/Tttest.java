package chapter02;

import java.util.Scanner;

public class Tttest {

	public static void main(String[] args) {
		
		int number=0;
		String nam=null;
		
		for(int i=0 ; i<10 ; i++)
		{
			number=(int)(Math.random()*(200-100+1)+100);
			nam=binary(number);
			System.out.println(number+"를 이진법으로 바꾸면"+nam);
		}
		
	}
	public static String binary(int value) {
		
		String num=null;
		
		num=Integer.toBinaryString(value);
		
		while(num.length()<=32)
		{
			num="0"+num;
		}
		return num;
	}
}