package chapter03;

import java.util.Scanner;

public class ifmun {

	public static void main(String[] args) {
		
		int i=0;
		int rando=0;
		// Math.random() 0����~0.999~1�� �ƴ� ���ڰ� ���� �ڹٿ��� ) c������ srand(time(NULL))�ʱ�ȭ rand()%(max-min+1)+min
		//Math.random* 50~100���� ������ (100-50+1)+50
		
		for(i=1;i<=10;i++)
		{
			//Scanner scan = new Scanner(System.in);
			rando=(int)(Math.random()*(100-50+1)+50);
			System.out.print("������ �Է��Ͻÿ�:");
			int num=rando;
			
			if(num%2==0)
			{
				System.out.println("�Էµ� ������ ¦���Դϴ�."+num);
			}
			else
			{
				System.out.println("�Էµ� ������ Ȧ���Դϴ�."+num);
			}
		}
	}
}
