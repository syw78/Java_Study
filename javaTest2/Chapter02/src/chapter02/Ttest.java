package chapter02;

import java.util.Scanner;

public class Ttest {

		public static void main(String [] args) {
	
			
			int num=0;
			double num2=0.0;
			String text=null;
			Scanner input=new Scanner(System.in);
			
			System.out.println("������ �Է��Ͻÿ�");
			text=input.nextLine();
			
			System.out.println("���ڸ� �Է��Ͻÿ�");
			num=input.nextInt();
			
			System.out.println("�Ǽ��� �Է��Ͻÿ�");
			num2=input.nextDouble();
			
			System.out.println(text);
			
			System.out.println((num+num2));

		}
}
