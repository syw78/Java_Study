package chapter02;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//�����Է�
		//2������ ��ȯ
		String num2="null";
		Scanner input=new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻÿ�");
		int num=input.nextInt();
		System.out.println();
		num2=toBinaryString(num);
		System.out.println(num2);
		
	}
	public static String toBinaryString(int value){
	
		String str="null";
		str=Integer.toBinaryString(value);
		while(str.length()<=32) 										 
		{																	 
			str=0+str;
			
		}
		return str;
	}
}

//length --- arrays (int[], double[], String[]) ---- �迭�� ���̸� �˷� �Ҷ� ����Ѵ�.

//length() --- String related Object (String, StringBuilder etc) - �̰��� ���ڿ��� ���̸� �˰��� �Ҷ� ���ȴ�.

//size() --- Collection Object (ArrayList, Set etc) �÷��� Ÿ���� ���̸� Ȯ���Ҷ� ���ȴ�.








	

