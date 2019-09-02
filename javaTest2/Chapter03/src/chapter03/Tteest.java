package chapter03;

import java.util.Scanner;

public class Tteest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("원하는 수 입력");
		int num=scan.nextInt();
		
	}
	
	public static String str(int value)
	{
		String num=null;
		
		num=Integer.toBinaryString(value);
		
		while(num.length()<32)
		{
			num="0"+num;
		}
		return num;

	
		
	}
}