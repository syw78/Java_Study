package chapter04;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE = 10;
		int [] seat = new int[SIZE] ;
		int number=0;
		System.out.println("------------------------");
		System.out.println("1 2 3 4 5 6 7 8 9 10");
		System.out.println("------------------------");
		System.out.println("0 0 0 0 0 0 0 0 0  0 ");
		for(int i=0;i<seat.length;i++) {
			initArrayValue(seat);
			Scanner scan =new Scanner(System.in);
			System.out.println("���Ͻô� �¼���ȣ�� �Է��ϼ���");
			number=scan.nextInt();
			
		}
		
	}
	public static void  initArrayValue(int [] seat)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("�ʱⰪ�� 10���� �Է��ϼ���");
		for(int i=0;i<seat.length;i++) {
			seat[i]=scan.nextInt();
		}
	}

}
