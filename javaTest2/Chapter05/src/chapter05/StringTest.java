package chapter05;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		String str=null;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����Ʈ�� �Է��ϼ��� :");
		str=scan.nextLine();
		if(str.equals("quit")) {
			System.exit(0);
			
		}else if (str.matches("^www\\.(.+)$")){
			System.out.println("ù�ܾ www.�� �Է��ϼ̽��ϴ�.");
			
		}else
			System.out.println("ù�ܾ www.~����������");
		
	}

}
