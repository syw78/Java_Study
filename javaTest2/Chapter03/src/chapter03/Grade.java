package chapter03;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		System.out.print("�̸��� �Է��Ͻÿ� ");
		String name=scan.nextLine();
			
		for(;;)
		{
			System.out.print("������ �Է��Ͻÿ� ");
			double num=scan.nextDouble();
			
			int result=(int)num/10;
			
			switch(result)
			{
			case 10 :	case 9 :
				System.out.println(name+" A����"); break;
			case 8 :
				System.out.println(name+" B����"); break;
			case 7:
				System.out.println(name+" C����"); break;
			default :
				System.out.println(name+" F����"); break;
			
			}
		}
	}

}
