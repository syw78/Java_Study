package chapter03;

import java.util.Scanner;

public class Exprint15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("키를 입력하세요");
		double tall=scan.nextDouble();
		double weight=(tall-100)*0.9;
		double user =65.0;
		
		if(user<weight)
		{
			System.out.println("저체중입니다.");
		}
		else if(user==weight)
		{
			System.out.println("표준체중입니다");
		}
		else if(user>weight)
		{
			System.out.println("과체중입니다.");
		}
		
	}

}
