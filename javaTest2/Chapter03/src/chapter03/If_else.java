package chapter03;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
		
		
		System.out.print("�̸��� �Է��Ͻÿ� ");
		String name=scan.nextLine();
			
		for(;;)
		{
			System.out.print("������ �Է��Ͻÿ� ");
			double num=scan.nextDouble();
			
			int result=(int)num;
			
			if(result>=90)
			{
				System.out.println(name+" A����"); break;
			}
			else if(result>=80)
			{
				System.out.println(name+" B����"); break;
			}
			else if(result>=70)
			{
				System.out.println(name+" C����"); break;
			}
			else
			{
				System.out.println(name+" F����"); break;
			}
			
		}
	}

}
