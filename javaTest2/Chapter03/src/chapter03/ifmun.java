package chapter03;

import java.util.Scanner;

public class ifmun {

	public static void main(String[] args) {
		
		int i=0;
		int rando=0;
		// Math.random() 0부터~0.999~1이 아닌 숫자가 나옴 자바에서 ) c에서는 srand(time(NULL))초기화 rand()%(max-min+1)+min
		//Math.random* 50~100가정 했을때 (100-50+1)+50
		
		for(i=1;i<=10;i++)
		{
			//Scanner scan = new Scanner(System.in);
			rando=(int)(Math.random()*(100-50+1)+50);
			System.out.print("정수를 입력하시오:");
			int num=rando;
			
			if(num%2==0)
			{
				System.out.println("입력된 정수는 짝수입니다."+num);
			}
			else
			{
				System.out.println("입력된 정수는 홀수입니다."+num);
			}
		}
	}
}
