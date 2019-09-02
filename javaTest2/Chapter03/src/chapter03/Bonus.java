package chapter03;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		for(;;)
		{
		System.out.print("실적을 입력하시오(단위:만원)");
		int money=scan.nextInt();
		
		if(money>1000)
		{
			System.out.println("실적달성");
			System.out.println("보너스 :"+(int)((money-1000)*0.1));
			break;
		}
		else
		{
			System.out.println(1000-money+"만원 미달입니다.");
			continue;
		}
		
		}
		
		
	}

}
