package gcd.app;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		//1. x,y 값을 입력받는다(1~100)
		int x=inputValue();
		int y=inputValue();
		int temp=0;
		//2. x,y값의 대소결정한다.(큰값 : x , 작은값 : y)
			if(x<y) {
				temp=x;
				x=y;
				y=temp;
			} 
			//3.최대 공약수 구하기
			while(true) {
				
				if(y==0) {
					System.out.println("최대공약수는"+x);
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
			
			System.out.println("1~100까지 수를 입력요망");
			Scanner scan=new Scanner(System.in);
			value=scan.nextInt();
			
			}while((value<1 && value>100));
		return value;
	}

}
