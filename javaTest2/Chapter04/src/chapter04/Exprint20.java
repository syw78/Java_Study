package chapter04;

import java.util.Scanner;

public class Exprint20 {

	public static void main(String[] args) {
		// �л��� �Է� ���� �Է�
		//��� ���
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�л��� ���� �Է��Ͻÿ�");
		int num=scan.nextInt();
		double sum=0.0;
		double [] result= new double[num];
		for(int i=0;i<num;i++)
		{
			
			System.out.print("�л�"+(i+1)+"�� ������ �Է��Ͻÿ�");
			result[i]=scan.nextDouble();
			
			if(result[i]<1||result[i]>100)
			{
				System.out.println("�߸��� �����Դϴ�. �ٽ� �Է��Ͻÿ�."); 
				i--;
				continue;
			}
			sum=sum+result[i];
		}
		System.out.println("���� �����"+sum/num+"�Դϴ�.");
	}
}
