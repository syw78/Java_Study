package gcd.app;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		//1. x,y ���� �Է¹޴´�(1~100)
		int x=inputValue();
		int y=inputValue();
		int temp=0;
		//2. x,y���� ��Ұ����Ѵ�.(ū�� : x , ������ : y)
			if(x<y) {
				temp=x;
				x=y;
				y=temp;
			} 
			//3.�ִ� ����� ���ϱ�
			while(true) {
				
				if(y==0) {
					System.out.println("�ִ�������"+x);
					break;
				}
				else {
					temp=x%y;
					x=y;
					y=temp;
				}
			}
		}
	
	public static int inputValue() {
		int value=0;
		
		do{
			
			System.out.println("1~100���� ���� �Է¿��");
			Scanner scan=new Scanner(System.in);
			value=scan.nextInt();
			
			}while((value<1 && value>100));
		return value;
	}

}
