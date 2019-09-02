package chapter02;

import java.util.Scanner;

public class Ttest {

		public static void main(String [] args) {
	
			
			int num=0;
			double num2=0.0;
			String text=null;
			Scanner input=new Scanner(System.in);
			
			System.out.println("문장을 입력하시오");
			text=input.nextLine();
			
			System.out.println("숫자를 입력하시오");
			num=input.nextInt();
			
			System.out.println("실수를 입력하시오");
			num2=input.nextDouble();
			
			System.out.println(text);
			
			System.out.println((num+num2));

		}
}
