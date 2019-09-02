package chapter03;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		System.out.print("이름을 입력하시오 ");
		String name=scan.nextLine();
			
		for(;;)
		{
			System.out.print("성적을 입력하시오 ");
			double num=scan.nextDouble();
			
			int result=(int)num/10;
			
			switch(result)
			{
			case 10 :	case 9 :
				System.out.println(name+" A학점"); break;
			case 8 :
				System.out.println(name+" B학점"); break;
			case 7:
				System.out.println(name+" C학점"); break;
			default :
				System.out.println(name+" F학점"); break;
			
			}
		}
	}

}
