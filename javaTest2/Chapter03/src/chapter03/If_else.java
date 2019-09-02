package chapter03;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
		
		
		System.out.print("이름을 입력하시오 ");
		String name=scan.nextLine();
			
		for(;;)
		{
			System.out.print("성적을 입력하시오 ");
			double num=scan.nextDouble();
			
			int result=(int)num;
			
			if(result>=90)
			{
				System.out.println(name+" A학점"); break;
			}
			else if(result>=80)
			{
				System.out.println(name+" B학점"); break;
			}
			else if(result>=70)
			{
				System.out.println(name+" C학점"); break;
			}
			else
			{
				System.out.println(name+" F학점"); break;
			}
			
		}
	}

}
