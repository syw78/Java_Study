package chapter04;

import java.util.Scanner;

public class B155p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = new int[5];
		int sum=0;
		for(int i=0;i<score.length;i++)
		{
			Scanner scan =new Scanner(System.in);
			System.out.println("������ �Է��Ͻÿ�");
			score[i]=scan.nextInt();
			sum=sum+score[i];
		}
		System.out.println("��ռ�����"+(sum/score.length)+"�Դϴ�.");
	}
}
