package chapter04;

import java.util.Scanner;

public class B161p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[]=new int[] {0,10,20,30,40,50,60,70,80,90,100};
		int i=0;
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("Ž���Ұ��� �Է��Ͻÿ� :");
		int num=scan.nextInt();
		for(i=0;i<s.length;i++)
		{
			if(s[i]==num)
			{
				System.out.println(num+"����"+i+"��ġ�� �ֽ��ϴ�.");
			}
		}
	}

}
