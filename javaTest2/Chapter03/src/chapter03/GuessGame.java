package chapter03;

import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int nam=0;
		int count=0;
		
		num=(int)(Math.random()*(100-1+1)+1);
		
		for(;;)
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("정답을 추측하여 보시오");
			nam=scan.nextInt();
			count++;
			if(nam<num)
			{
				System.out.println("제시한 정수가 낮습니다");
			}
			else if(nam>num)
			{
				System.out.println("제시한 정수가 높습니다");
			}
			else if(nam==num)
			{
				System.out.println("축하합니다. 시도횟수:"+count);
				break;
			}
		}
	}
}
