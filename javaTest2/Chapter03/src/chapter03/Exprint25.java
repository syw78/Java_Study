package chapter03;

import java.util.Scanner;

public class Exprint25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n=0.0,i=0.0;
		double sum=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("n을 입력하시오");
		n=scan.nextDouble();
		
		for(i=1;i<=n;i++)
		{
			sum=sum+1/i;
		}
		System.out.println("수열의 합은"+sum);
	}

}
