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
				System.out.println("�ִ�������"+x);
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
		System.out.print("1���� 100������ ������ �Է��ϼ���");
		num=scan.nextInt();
		}while(num<1||num>100);
		return num;
	}
}