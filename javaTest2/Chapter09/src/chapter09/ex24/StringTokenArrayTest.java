package chapter09.ex24;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenArrayTest {

	public static void main(String[] args) {
		//단어들을 문자열 배열에 넣고
		//이 배열을 Arrays의 sort(0메소드를 이용하여 정렬
		String[] strArray= null;
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열입력요망:");
		String str = scan.nextLine();
		
		StringTokenizer st=new StringTokenizer(str);
		strArray = new String[st.countTokens()];
		int i=0;
		while(st.hasMoreTokens()) {
			strArray[i++]=st.nextToken();
		}
		
		for(String string:strArray) {
			System.out.print(string+" ");
		}
		Arrays.sort(strArray);
		System.out.println(" ");
		for(String string:strArray) {
			System.out.print(string+" ");
		}
	}

}
