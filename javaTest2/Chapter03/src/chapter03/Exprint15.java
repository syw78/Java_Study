package chapter03;

import java.util.Scanner;

public class Exprint15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ���");
		double tall=scan.nextDouble();
		double weight=(tall-100)*0.9;
		double user =65.0;
		
		if(user<weight)
		{
			System.out.println("��ü���Դϴ�.");
		}
		else if(user==weight)
		{
			System.out.println("ǥ��ü���Դϴ�");
		}
		else if(user>weight)
		{
			System.out.println("��ü���Դϴ�.");
		}
		
	}

}
