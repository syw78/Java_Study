package chapter03;

import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int nam=0;
		int count=0;
		
		num=(int)(Math.random()*(100-1+1)+1);
		
		for(;;)
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("������ �����Ͽ� ���ÿ�");
			nam=scan.nextInt();
			count++;
			if(nam<num)
			{
				System.out.println("������ ������ �����ϴ�");
			}
			else if(nam>num)
			{
				System.out.println("������ ������ �����ϴ�");
			}
			else if(nam==num)
			{
				System.out.println("�����մϴ�. �õ�Ƚ��:"+count);
				break;
			}
		}
	}
}
