package chapter04;

import java.util.Scanner;

public class B155p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = new int[5];
		int sum=0;
		for(int i=0;i<score.length;i++)
		{
			Scanner scan =new Scanner(System.in);
			System.out.println("성적을 입력하시오");
			score[i]=scan.nextInt();
			sum=sum+score[i];
		}
		System.out.println("평균성적은"+(sum/score.length)+"입니다.");
	}
}
