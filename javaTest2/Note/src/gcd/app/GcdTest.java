package gcd.app;

import java.util.Scanner;

public class GcdTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		int y=0;
		int temp=0;
		x=input();
		y=input();
		
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
		Scanner scan = new Scanner(System.in);
		System.out.println("1부터 100사이의 정수를 입력하세요");
		num=scan.nextInt();
		}while(num<1||num>100);
		return num;
	}

}
