package chapter03;

import java.util.Scanner;

public class Gcd1 {

	public static void main(String[] args) {
	
		int x=input();
		int y=input();
		int temp=0;
		
		if(x<y)
			{
				temp=x;
				x=y;
				y=temp;
			}
		while(true)
		{
			if(y==0)
			{
				System.out.println("최대공약수는"+x);
				break;
				
			}
			else
			{
				temp=x%y;
				x=y;
				y=temp;
						
			}
		}
		
		
		
		
	}
	public static int input()
	{
		int num=0;
		do
		{
		Scanner scan=new Scanner(System.in);
		System.out.print("1부터 100사이의 정수를 입력하세요");
		num=scan.nextInt();
		}while(num<1||num>100);
		return num;
	}
}