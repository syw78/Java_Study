package chapter03;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		for(;;)
		{
		System.out.print("������ �Է��Ͻÿ�(����:����)");
		int money=scan.nextInt();
		
		if(money>1000)
		{
			System.out.println("�����޼�");
			System.out.println("���ʽ� :"+(int)((money-1000)*0.1));
			break;
		}
		else
		{
			System.out.println(1000-money+"���� �̴��Դϴ�.");
			continue;
		}
		
		}
		
		
	}

}
