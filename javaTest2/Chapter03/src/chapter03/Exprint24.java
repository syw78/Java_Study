package chapter03;

import java.util.Scanner;

public class Exprint24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a=0, b=1, c=0;
		int i=0;
		int num=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("���° �ױ��� ����ϰڽ��ϱ�?");
		num=scan.nextInt();
		
		for(i=2;i<=num+1;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" " );
		}
	}

}
