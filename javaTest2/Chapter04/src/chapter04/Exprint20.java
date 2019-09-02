package chapter04;

import java.util.Scanner;

public class Exprint20 {

	public static void main(String[] args) {
		// 학생수 입력 성적 입력
		//평균 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.print("학생의 수를 입력하시오");
		int num=scan.nextInt();
		double sum=0.0;
		double [] result= new double[num];
		for(int i=0;i<num;i++)
		{
			
			System.out.print("학생"+(i+1)+"의 성적을 입력하시오");
			result[i]=scan.nextDouble();
			
			if(result[i]<1||result[i]>100)
			{
				System.out.println("잘못된 성적입니다. 다시 입력하시오."); 
				i--;
				continue;
			}
			sum=sum+result[i];
		}
		System.out.println("성적 평균은"+sum/num+"입니다.");
	}
}
