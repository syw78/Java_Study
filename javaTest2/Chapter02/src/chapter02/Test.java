package chapter02;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//정수입력
		//2진수로 변환
		String num2="null";
		Scanner input=new Scanner(System.in);
		
		System.out.println("정수를 입력하시오");
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

//length --- arrays (int[], double[], String[]) ---- 배열의 길이를 알려 할때 사용한다.

//length() --- String related Object (String, StringBuilder etc) - 이것은 문자열의 길이를 알고자 할때 사용된다.

//size() --- Collection Object (ArrayList, Set etc) 컬렉션 타입의 길이를 확인할때 사용된다.








	

