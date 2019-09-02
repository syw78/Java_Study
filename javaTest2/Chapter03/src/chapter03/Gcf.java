package chapter03;

import java.util.Scanner;

public class Gcf {

	public static void main(String[] args) {
		int x=0;
		int y=0;
		int r=0;
		Scanner scan=new Scanner(System.in);
		do {

			System.out.println("정수를 입력하시오 : ");
			x=scan.nextInt();
			System.out.println("정수를 입력하시오 : ");
			y=scan.nextInt();
		}while( (x<1 && x>100) && (y<1 && y>100));
		for(;;)
		{
			if(y==0)
			{
				System.out.println("최대공약수"+x);
				break;
			}
			else 
			{
				r=x%y;
				x=y;
				y=r;
			}
		}
	}

}
